<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="/views/common/header.jsp"%>
<title>出错了。。。</title>
    <script type="text/javascript">  
        $(function(){  
            $("#center-div").center(true);  
        });
    </script>  
</head>
<body style="margin: 0;padding: 0;background-color: #f5f5f5;">  
    <div id="center-div">  
        <table style="height: 100%; width: 600px; text-align: center;">  
            <tr>  
                <td>  
                <img width="220" height="393" src="${ctx}/static/images/common/error.png" style="float: left; padding-right: 20px;" alt="" />  
                    <%-- <%= exception.getMessage()%>   --%>
                    <c:out value="${exception.getMessage()}"/>
                    <p style="line-height: 12px; color: #666666; font-family: Tahoma, '宋体'; font-size: 12px; text-align: left;">  
                    <a href="javascript:history.go(-1);">返回</a>!!!  
                    </p>  
                </td>  
            </tr>  
        </table>  
    </div>  
</body>  
</html>