<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<%@ include file="/views/common/header.jsp"%>
</head>
<body>
<body class="easyui-layout">
    <div data-options="region:'north',title:'North Title',split:true" style="height:150px;"><a href="${ctx}/logout">退出</a></div>   
    <div data-options="region:'south',title:'South Title',split:true" style="height:100px;">2</div>   
    <div data-options="region:'east',iconCls:'icon-reload',title:'East',split:true" style="width:300px;">3</div>   
    <div data-options="region:'west',title:'West',split:true" style="width:230px;">4</div>   
    <div data-options="region:'center',title:'center title'" style="padding:5px;background:#eee;">5</div>   
</body>  
</body>
</html>