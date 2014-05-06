/**
 * 项目名:Web内容管理系统
 * 包名：com.harlankuo.hyacinth.wcms.web.interceptor
 * 文件名：AuthorityAnnotationInterceptor.java
 * 版本信息：1.0
 * 日期：2014年4月24日-下午2:02:14
 * 作者：harlankuo
 * Copyright (c)2014版权所有--harlankuo
 */

package com.harlankuo.hyacinth.wcms.web.interceptor;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.harlankuo.hyacinth.wcms.Annotation.Authority;
import com.harlankuo.hyacinth.wcms.model.SysUser;
import com.harlankuo.hyacinth.wcms.web.utils.SessionHelper;

/**
 * 类名称：AuthorityAnnotationInterceptor 类描述： 创建人：harlankuo 修改人：harlankuo
 * 修改时间：2014年4月24日 下午2:02:14 修改备注：@version 1.0.0
 */

public class AuthorityAnnotationInterceptor extends HandlerInterceptorAdapter {

	final Logger logger = LoggerFactory.getLogger(getClass());

	private List<String> uncheckHandlers;

	public List<String> getUncheckHandlers() {
		return uncheckHandlers;
	}

	public void setUncheckHandlers(List<String> uncheckHandlers) {
		this.uncheckHandlers = uncheckHandlers;
	}

	private List<String> uncheckUrls;

	public void setUncheckUrls(List<String> uncheckUrls) {
		this.uncheckUrls = uncheckUrls;
	}

	public List<String> getUncheckUrls() {
		return uncheckUrls;
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		super.afterConcurrentHandlingStarted(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		// 第一种在自定义的过滤器中过滤路径
		/*
		 * String basePath =
		 * request.getScheme()+"://"+request.getServerName()+":"
		 * +request.getServerPort()+request.getContextPath()+"/"; String
		 * requestPath = request.getRequestURL().toString(); for (String
		 * uncheckUrl : uncheckUrls) { if(requestPath.contains(basePath +
		 * (uncheckUrl.indexOf('/')==0?uncheckUrl.substring(1):uncheckUrl))){
		 * return true; } }
		 */

		// 第二种在自定义的过滤器中过滤handler
		if (uncheckHandlers.contains(handler.getClass().getName())) {
			return true;
		}
		HandlerMethod handler2 = (HandlerMethod) handler;
		Authority authority = handler2.getMethodAnnotation(Authority.class);

		if (null == authority) {
			// 没有声明权限,放行
			return true;
		}

		logger.debug("authority", authority.toString());

		HttpSession session = request.getSession();
		SysUser sysUser = (SysUser) session
				.getAttribute(SessionHelper.UserHandler);
		boolean aflag = false;

		for (AuthorityType at : authority.authorityTypes()) {
			/*if (AuthorityHelper.hasAuthority(at.getIndex(),
					sysUser.getRightContent()) == true) {
				aflag = true;
				break;
			}*/
		}

		if (false == aflag) {

			if (authority.resultType() == ResultTypeEnum.page) {
				// 采用传统页面进行提示
				StringBuilder sb = new StringBuilder();
				sb.append(request.getContextPath());
				sb.append("/mg/userIndex.jsp?oprst=false&opmsg=").append(
						URLEncoder.encode("没有权限", "utf-8"));
				response.sendRedirect(sb.toString());
			} else if (authority.resultType() == ResultTypeEnum.json) {
				// 采用ajax方式的进行提示
				response.setCharacterEncoding("utf-8");
				response.setContentType("text/html;charset=UTF-8");
				OutputStream out = response.getOutputStream();
				PrintWriter pw = new PrintWriter(new OutputStreamWriter(out,
						"utf-8"));
				pw.println("{\"result\":false,\"code\":12,\"errorMessage\":\"没有权限\"}");
				pw.flush();
				pw.close();
			}

			return false;

		}

		return true;

	}

}
