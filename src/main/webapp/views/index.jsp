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
    <div data-options="region:'center',title:'center title'" style="padding:5px;background:#eee;">
		<table width="80%"  border="0">
		  <tr bgcolor="#58ED64">
		    <th width="25%">id</th>
		    <th width="34%">姓名</th>
		    <th colspan="2">密码</th>
		  </tr>
		  <c:forEach items="${userInfoList}" var="userInfoDTO"> 
		  <tr bgcolor="#D6EBF8">
		    <td height="30px"><c:out value="${userInfoDTO.userId}"/></td>
		    <td height="30px"><c:out value="${userInfoDTO.userName}"/></td>
		    <td height="30px"><c:out value="${userInfoDTO.userPassword}"/></td>
		  </tr>
		  </c:forEach>
		</table>
		<%@ include file="/views/common/pagination.jsp"%>
	</div>   
</body>  
</body>
</html>