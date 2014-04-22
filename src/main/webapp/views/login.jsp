<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Web内容管理系统</title>
<LINK rel=stylesheet type=text/css href="static/css/login.css">
</head>
<body>
	<DIV class=on_indext>
		<DIV class=on_index>
			<DIV class=box>
				<DIV class=box_logo>
					<IMG class=png title=Web内容管理系统登陆 src="static/images/login/logo.png"
						width=460 height=40>
				</DIV>
				<DIV class=login>
					<FORM onSubmit="return checksubmit();" method=post name=form1 action="admin/index">
						<TABLE class=login-body border=0 cellSpacing=0 cellPadding=0 align=center>
							<TBODY>
								<TR>
									<TD class=listt>用户名：</TD>
									<TD align=left><INPUT class=inputbg2 value="" tabIndex=1 maxLength=62 type=text name=username></TD>
								</TR>
								<TR>
									<TD class=listt>管理密码：</TD>
									<TD align=left><INPUT class=inputbg2 tabIndex=1
										maxLength=25 value="" type=password name=password></TD>
								</TR>
								<TR>
									<TD class=listt>验证码：</TD>
									<TD><INPUT class=inputbg tabIndex=1 maxLength=6 align=left type=text name=v_code>
										<IMG id=VerifyCode class=codepic alt="看不清，换一张 "
										align=absMiddle src="static/images/login/code_pic.gif"> 
										<INPUT value=1 type=hidden name=flag>
										</TD>
								</TR>
								<TR>
									<TD class=listt></TD>
									<TD height=39 width=165 align=left>
										<INPUT src="static/images/login/btn_login.gif" type=image name=submit></TD>
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