package com.harlankuo.hyacinth.wcms.utils.buildercode;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;

/** 生成相应的类文件 **/
public class SpliceSQL {

	private static String _driver = "com.mysql.jdbc.Driver";
	private static String _url = "jdbc:mysql://127.0.0.1:3306/qgy?useunicode=true&amp;characterEncoding=utf8";
	private static String _userName = "root";
	private static String _userPass = "root";
	private static String _model_package = "net.yqd.qsy.model";			//生成MODEL文件
	private static String _dao_package = "net.yqd.qsy.dao";			//生成DAO文件
	private static String _templete_url = "E:/work/qingshiyan/qsy/src/net/yqd/qsy/utils/buildercode";		//模板目录
	private static String _root_url = "E:/work/qingshiyan/qsy/src/";				//项目SRC的根目录
	private static String _tables = "single_news,list_news";		//表名称

	private static Connection conn = null;

	public static void main(String[] args) {
		System.out.println("------------------开始运行-------------------");
		getConnection();
		SpliceSQL spliceSQL = new SpliceSQL();
		String tNames[] = _tables.split(","); 
		
		for(int i = 0 ; i < tNames.length ; i++){
			spliceSQL.generateClassModel(tNames[i]);
			spliceSQL.generateClassDao(tNames[i]);
			System.out.println("正在执行第" + i + "张表!");
		}
		closeConn();
		System.out.println("------------------运行成功-------------------");
	}

	/** 得到连接 **/
	public synchronized static Connection getConnection() {
		if (conn == null) {
			try {
				Class.forName(_driver);
				conn = DriverManager.getConnection(_url, _userName, _userPass);
				return conn;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		} else {
			return conn;
		}
	}

	/** 关闭连接 **/
	public synchronized static void closeConn() {
		try {
			if (conn != null) {
				conn.close();
				conn = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/** 生成Model **/
	public void generateClassModel(String tableName){
		try{
			DatabaseMetaData dmd = conn.getMetaData();
			ResultSet rs = dmd.getColumns(null,"%", tableName,"%");
			Map root = new HashMap();
			root.put("className",tableName.toUpperCase());
			root.put("package", _model_package); 
			root.put("upper", new FirstUpperDirective()); 
			
			List propertyList = new ArrayList();
			List importList = new ArrayList();
			DataType dataType = null;
			
			while(rs.next()){
				
			   Map sonItms = new HashMap();
			   dataType = DataType.getType(rs.getString("TYPE_NAME"));
			   sonItms.put("name", rs.getString("COLUMN_NAME").toLowerCase());
			   sonItms.put("type", dataType);
			   sonItms.put("comment", rs.getString("REMARKS"));
			   importByDataType(dataType, importList);
			   propertyList.add(sonItms);
			}
			root.put("imports", importList);
			root.put("columns", propertyList);
			
			Configuration cfg = new Configuration(); 
			cfg.setDirectoryForTemplateLoading(new File(_templete_url)); 
			Template temp = cfg.getTemplate("Model.ftl");
			// 指定模板如何检索数据模型，这是一个高级的主题了… 
			// 但先可以这么来用： 
			cfg.setObjectWrapper(new DefaultObjectWrapper());
			OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(new File(_root_url 
														+ _model_package.replaceAll("\\.", "/") + "/" + tableName.toUpperCase() + ".java"))); 
			temp.process(root, out); 
			out.flush(); 
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/** 生成DAO **/
	public void generateClassDao(String tableName){
		try{
			DatabaseMetaData dmd = conn.getMetaData();
			ResultSet rs = dmd.getColumns(null,"%", tableName,"%");
			Map root = new HashMap();
			root.put("className",tableName.toUpperCase());
			root.put("package", _dao_package); 
			root.put("upper", new FirstUpperDirective()); 
			
			String property = "";		//column名称
			String v_property = "";		//column值表达示
			String u_property = "";		//更新语句
			List importList = new ArrayList();
			importList.add(_model_package + "." + tableName.toUpperCase());
			DataType dataType = null;
			
			while(rs.next()){
				property +=  rs.getString("COLUMN_NAME").toLowerCase() + ",";
				v_property += ":1." + rs.getString("COLUMN_NAME").toLowerCase() + ",";
				u_property  += rs.getString("COLUMN_NAME").toLowerCase() + " = :1." + rs.getString("COLUMN_NAME").toLowerCase() + ",";
				dataType = DataType.getType(rs.getString("TYPE_NAME"));
				importByDataType(dataType, importList);
			}
			root.put("imports", importList);
			root.put("property", property.substring(0, property.length() - 1));
			root.put("v_property", v_property.substring(0, v_property.length() - 1));
			root.put("u_property", u_property.substring(0, u_property.length() - 1));
			
			Configuration cfg = new Configuration(); 
			cfg.setDirectoryForTemplateLoading(new File(_templete_url)); 
			Template temp = cfg.getTemplate("DAO.ftl");
			// 指定模板如何检索数据模型，这是一个高级的主题了… 
			// 但先可以这么来用： 
			cfg.setObjectWrapper(new DefaultObjectWrapper());
			OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(new File(_root_url 
														+ _dao_package.replaceAll("\\.", "/") + "/" + tableName.toUpperCase() + "DAO.java"))); 
			temp.process(root, out); 
			out.flush(); 
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/** import 类名称 **/
	public void importByDataType(DataType type, List importList) {

		if (type.getValue().equals(DataType.Date.getValue())) {
			importList.add(Date.class.toString().replace("class", ""));
		}

		if (type.getValue().equals(DataType.BigDecimal.getValue())) {
			importList.add(BigDecimal.class.toString().replace("class", ""));
		}

		if (type.getValue().equals(DataType.Timestamp.getValue())) {
			importList.add(Timestamp.class.toString().replace("class", ""));
		}

	}
}

/** 类型 Enum **/
enum DataType {
	Integer("int"), String("String"),Double("DOUBLE"), Date("DATE"),DateTime("DATETIME"), BigDecimal("DECIMAL"), Timestamp(
			"TIMESTAMP");

	private String value;

	private DataType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static DataType getType(String value) {
		
		if (value.equals("INT")) {
			return DataType.Integer;
		}

		if (value.equals("VARCHAR")) {
			return DataType.String;
		}

		if (value.equals("CHAR")) {
			return DataType.String;
		}
		
		if (value.equals("TEXT")) {
			return DataType.String;
		}

		if (value.equals("DATE")) {
			return DataType.Date;
		}
		
		if(value.equals("DOUBLE")){
			return DataType.Double;
		}
		
		if(value.equals("DATETIME")){
			return DataType.Timestamp;
		}

		if (value.equals("DECIMAL")) {
			return DataType.BigDecimal;
		}

		if (value.equals("TIMESTAMP")) {
			return DataType.Timestamp;
		}
		return null;
	}
}
