<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Web内容管理系统</title>
<%@ include file="/views/common/header.jsp"%>
<LINK rel=stylesheet type=text/css href="${ctx}/static/css/login.css">
<script type="text/javascript">
	$(function(){
		$('#form1').form({   
			url:"login2",
			onSubmit:function(){
				var userName=$('#userName').val();
				var userPassword=$('#userPassword').val();
				if(userName=='' || userName==null ){
					$.messager.alert('错误','您输入的用户名不能为空！','info',function(){
						$('#userName').val();
						$('#userName').focus();
						
					});
					return false;
				}
				if(userPassword=='' || userPassword==null ){
					$.messager.alert('错误','您输入的密码不能为空！','info',function(){
						$('#userPassword').val();
						$('#userPassword').focus();
						
					});
					return false;
				}
				$.messager.progress({
					text:'系统正在登录中...'
				});
			},
		    success: function(returnValue){    
		        //var data = eval('(' + data + ')');  // change the JSON string to javascript object  
		        var data=JSON.parse(returnValue);
		        if (data.success){    
		        	window.location.href=data.url;
		        }else{
					$.messager.alert('错误','您输入的用户名和密码不正确！','info',function(){
						$.messager.progress('close');
						$('#userPassword').val();
						$('#userPassword').focus();
					});
		        }
		    }    
		});  
		
		$('#btn_login').click(function(){
			//$('#form1').submit();
		});
	});
</script>
</head>
<body>
	<DIV class=on_indext>
		<DIV class=on_index>
			<DIV class=box>
				<DIV class=box_logo>
					<IMG class=png title=Web内容管理系统登陆 src="${ctx}/static/images/login/logo.png"
						width=460 height=40>
				</DIV>
				<DIV class=login>
					<FORM method=post id="form1" name=form1 >
						<TABLE class=login-body border=0 cellSpacing=0 cellPadding=0 align=center>
							<TBODY>
								<TR>
									<TD class=listt>用户名：</TD>
									<TD align=left><INPUT class=inputbg2 value="" tabIndex=1 maxLength=62 type=text name=userName id=userName></TD>
								</TR>
								<TR>
									<TD class=listt>管理密码：</TD>
									<TD align=left><INPUT class=inputbg2 tabIndex=1
										maxLength=25 value="" type=password name=userPassword id="userPassword"></TD>
								</TR>
								<TR>
									<TD class=listt>验证码：</TD>
									<TD><INPUT class=inputbg tabIndex=1 maxLength=6 align=left type=text name=v_code>
										<IMG id=VerifyCode class=codepic alt="看不清，换一张 "
										align=absMiddle src="${ctx}/static/images/login/code_pic.gif"> 
										<INPUT value=1 type=hidden name=flag>
										</TD>
								</TR>
								<TR>
									<TD class=listt></TD>
									<TD height=39 width=165 align=left>
										<INPUT src="${ctx}/static/images/login/btn_login.gif" type=image name=btn_login id="btn_login"></TD>
								</TR>
							</TBODY>
						</TABLE>
					</FORM>
				</DIV>
				<!--login-->
			</DIV>
			<!--box-->
			<DIV class="boxbg png"></DIV>
			<DIV class="foot png">Copyright © 2010-2014 Web内容管理系统  All rights reserved.</DIV>
		</DIV>
		<!--on_index-->
	</DIV>
</body>
</html>