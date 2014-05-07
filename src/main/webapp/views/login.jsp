<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Web内容管理系统</title>
<%@ include file="/views/common/header.jsp"%>
<LINK rel=stylesheet type=text/css href="${ctx}/static/css/login.css">
<LINK rel=stylesheet type=text/css href="${ctx}/static/js/easyui/themes/default/tooltip.css">
<LINK rel=stylesheet type=text/css href="${ctx}/static/js/easyui/themes/default/validatebox.css">
<script type="text/javascript">
	$(function(){
		$('#form1').form({   
			url:"login2",
			onSubmit:function(){
/* 				var isValid = $(this).form('validate');
				if (!isValid){
					$.messager.progress('close');	// 如果表单是无效的则隐藏进度条
				} */
				return $(this).form('validate');	// 返回false终止表单提交
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
		
		$("#btn_login").click(function(){
			$('#form1').form('submit');
		});
		
		$('#VerifyCode').click(function(){
			$(this).hide().attr('src', 'captcha/getCaptcha?' + Math.floor(Math.random()*100) ).fadeIn();  
		});
		
		$.extend($.fn.validatebox.defaults.rules, {    
			checkCaptchaCode: {    
		        validator: function(value, param){    
		            return checkCaptcha(value);
		        },    
		        message: '验证码不正确...'
		    }
		});  
		
		$('input.easyui-validatebox').validatebox('disableValidation')
        .focus(function () { 
        	$(this).validatebox('enableValidation');
        }).blur(function () { 
        	$(this).validatebox('validate')
        });
		
		function checkCaptcha(captchaCode){
			var rflag=false;
			$.ajax("captcha/checkCaptcha",{
				async:false,
				data:{txtVerifyCode:captchaCode},
				//dataType:"json",
				type:"GET",
				success:function(returnValue){
					var data=JSON.parse(returnValue);
					rflag=data.success;
				}
			});
			return rflag;
		}
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
									<TD align=left><INPUT class="inputbg2 easyui-validatebox" data-options="required:true,validType:'length[4,25]'" maxLength=25 type=text name=userName id=userName></TD>
								</TR>
								<TR>
									<TD class=listt>管理密码：</TD>
									<TD align=left><INPUT class="inputbg2 easyui-validatebox" data-options="required:true,validType:'length[4,25]'"
										maxLength=25 type=password name=userPassword id="userPassword"></TD>
								</TR>
								<TR>
									<TD class=listt>验证码：</TD>
									<TD><INPUT id="txtVerifyCode" class="inputbg easyui-validatebox" data-options="required:true,tipPosition:'left',validType:'checkCaptchaCode',invalidMessage:'验证码不正确'" maxLength=5 align=left type=text name=v_code>
										<IMG id=VerifyCode class=codepic alt="看不清，换一张" align=absMiddle src="captcha/getCaptcha">
										</TD>
								</TR>
								<TR>
									<TD class=listt></TD>
									<TD height=39 width=165 align=left>
										<%-- <INPUT src="${ctx}/static/images/login/btn_login.gif" type=image name=btn_login id="btn_login"> --%>
										<img style="display:inline;" id="btn_login" src="${ctx}/static/images/login/btn_login.gif"/>
									</TD>
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