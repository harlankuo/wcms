<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*" pageEncoding="UTF-8"%>
<%
 	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../static/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="../static/js/easyui/themes/default/layout.css">
<link rel="stylesheet" type="text/css" href="../static/js/easyui/themes/icon.css">
<script type="text/javascript" src="../static/js/jquery/jquery-1.11.0.js"></script>
<script type="text/javascript" src="../static/js/easyui/jquery.easyui.min.js"></script>
</head>
<body>
<body class="easyui-layout">
    <div data-options="region:'north',title:'North Title',split:true" style="height:150px;">1</div>   
    <div data-options="region:'south',title:'South Title',split:true" style="height:100px;">2</div>   
    <div data-options="region:'east',iconCls:'icon-reload',title:'East',split:true" style="width:300px;">3</div>   
    <div data-options="region:'west',title:'West',split:true" style="width:230px;">4</div>   
    <div data-options="region:'center',title:'center title'" style="padding:5px;background:#eee;">5</div>   
</body>  
</body>
</html>