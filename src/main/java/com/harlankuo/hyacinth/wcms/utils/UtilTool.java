package com.harlankuo.hyacinth.wcms.utils;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

/** 工具类 **/
public class UtilTool {
	
	public static DecimalFormat dftJW = new DecimalFormat("##.######");
	public static DecimalFormat dft = new DecimalFormat("##.##");
	
	/**
	 * 判断并出初化BigDecimal
	 * @param val
	 * @return
	 */
	public static BigDecimal bigDecimal(BigDecimal val){
		if(val == null){
			return new BigDecimal(0);
		}
		return val;
	}
	
	/**
	 * 字符串转整型
	 * @param str
	 * @return
	 */
	public static int str2int(String str){
		try{
			return Integer.parseInt(str);
		}catch(Exception e){
			//e.printStackTrace();
			return 0;
		}
	}
	/**
	 * 字符串转成长整型
	 * @param str
	 * @return
	 */
	public static long str2Long(String str){
		try{
			return Long.parseLong(str);
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
	
	
	/**
	 * 字符串转成浮点型
	 * @param str
	 * @return
	 */
	public static double str2double(String str){
		try{
			return Double.parseDouble(dft.format(Double.parseDouble(str)));
		}catch(Exception e){
			//e.printStackTrace();
			return 0;
		}
	}
	/**
	 * 字符串转成浮点型
	 * @param str
	 * @return
	 */
	public static float str2Float(String str){
		try{
			return Float.parseFloat(dft.format(Double.parseDouble(str)));
		}catch(Exception e){
			//e.printStackTrace();
			return 0;
		}
	}
	/**
	 * 字符串转成浮点型
	 * @param str
	 * @return
	 */
	public static double str2doubleJW(String str){
		try{
			return Double.parseDouble(dftJW.format(Double.parseDouble(str)));
		}catch(Exception e){
			//e.printStackTrace();
			return 0;
		}
	}
	/**
	 * 判断是否为数字
	 * @param strMes
	 * @return
	 */
	public static boolean ifNum(String strMes){
		try{
			Integer.parseInt(strMes);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * 判断是否为数字
	 * @param strMes
	 * @return
	 */
	public static boolean ifLongNum(String strMes){
		try{
			Long.parseLong(strMes);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	/**
	 * 判断是否为浮点数
	 * @param strMes
	 * @return
	 */
	public static boolean ifDuble(String strMes){
		try{
			Double.parseDouble(strMes);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	/**
	 * 判断是否是日期
	 * @param strMes
	 * @return
	 */
	public static boolean ifDate(String strMes){
		
		try{
			SimpleDateFormat sdfYMDHMS = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    		Date recDate = sdfYMDHMS.parse(strMes);
    		if(recDate.after(new Date())){
    			return false;
    		}else{
    			return true;
    		}
    	}catch(Exception e){
    		e.printStackTrace();
    		return false;
    	}
	}
	/**
	 * 把传来的毫秒转换成时分秒
	 * @param len
	 * @return
	 */
	public static String formatLongToTimeStr(Long len) {
        //String str = "";
        int hour = 0;
        int minute = 0;
        int second = 0;

        second = len.intValue() / 1000;

        if (second > 60) {
            minute = second / 60;
            second = second % 60;
        }
        if (minute > 60) {
            hour = minute / 60;
            minute = minute % 60;
        }
        return hour + "小时" + minute  + "分钟"+ second  + "秒";
    }
	
	public static Date getYestodyStr(){
		try{
			Calendar cld = Calendar.getInstance();
			cld.setTime(new Date());
			cld.add(Calendar.DATE, -1);
			return cld.getTime();
		}catch(Exception e){
			e.toString();
			return new Date();
		}
	}
	
	
	
	/**
	 * 字符串转成以'sep'分隔的串
	 * @param array
	 * @param sep
	 * @return
	 */
	public static String join(String[] array, String sep) {   
	    if (array == null) {   
	        return "";   
	    }   
	    if (array.length == 0) {   
	        return "";   
	    }   
	    if (sep == null) {   
	        sep = "";   
	    }   
	    StringBuilder sb = new StringBuilder();   
	    for (String tkey : array) {   
	        sb.append(tkey);   
	        sb.append(sep);   
	    }   
	    int len = sb.length();   
	    sb.delete(len - sep.length(), len);   
	    return sb.toString();   
	}  
	/**
	 * 返回一个Double,跟据传来的小数据位截取
	 * @param doubNum  传来的浮点数
	 * @param pointNum 传来的小数点位数
	 * @return
	 */
	public static Double doubFormat(Double doubNum , int pointNum){
		
		try{
			StringBuffer str = new StringBuffer(".");
			for(int i = 0 ; i < pointNum ; i ++){
				str.append("#");
			}
			dft = new DecimalFormat(str.toString());
			return Double.valueOf(dft.format(doubNum));
		}catch(Exception e){
			e.printStackTrace();
			return 0.0;
		}
		
	}
	/**
	 * NULL转成空格
	 * @param str
	 * @return
	 */
	public static String null2space(String str){
		if(str == null){
			str = "";
		}
		return str;
	}
    /**
     * 判断是否是(数字，字母，下划线，汉字)
     * 如果正确返回true,否者false
     * @param str
     * @return
     */
	public static boolean noSpeStr(String str){
		String regex = "^(\\w|[\u4E00-\u9FA5])*$";
		Pattern pt = Pattern.compile(regex);
		return pt.matcher(str).matches();
	}
	
	/**
	 * 得到一定LEN个字符组成的字符串
	 * @param chars			字符
	 * @param len			长度
	 * @return
	 */
	public static String getCharByLen(String chars,int len){
		
		StringBuffer result = new StringBuffer("");
		for(int i = 0 ; i < len ; i ++){
			result.append(chars);
		}
		return result.toString();
	}
	/**
	 * 长度不够的话左边补字符
	 * @param chars			要补的字符
	 * @param len			长度
	 * @param vars			字符串
	 * @return
	 */
	public static String leftRefill(String chars,int len,String vars){
		
		String result = "";
		if(vars.length() < len){
			for(int i = 0 ; i < len - vars.length(); i++){
				result += chars;
			}
			result = result + vars;
		}else{
			result = vars;
		}
		return result;
	}
	
	/**
	 * 验证参数
	 * @param paraStr
	 * @return
	 */
	public static boolean checkPara(String paraStr){
		boolean isSucc = true;
		
		if(paraStr == null || paraStr.equals("")){
			isSucc = false;
		}
		return isSucc;
	}
	 /**   
	  * 全角转半角
	  *    
	  * @param input   
	  * @return   
	  */   
	public static String toDBC(String input) { 
		
		char[] c = input.toCharArray();    
		for (int i = 0; i < c.length; i++) {    
			if (c[i] == 12288) {    
			c[i] = (char) 32;    
			continue;    
		}    
	    if (c[i] > 65280 && c[i] < 65375)    
		   c[i] = (char) (c[i] - 65248);    
		}    
		return new String(c);    
	} 
	
	public static void main(String[] args) {
	}

}
