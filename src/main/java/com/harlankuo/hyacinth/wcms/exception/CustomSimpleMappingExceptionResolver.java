/**
 * 项目名:Web内容管理系统
 * 包名：com.harlankuo.hyacinth.wcms.exception
 * 文件名：CustomSimpleMappingExceptionResolver.java
 * 版本信息：1.0
 * 日期：2014年5月4日-上午11:24:48
 * 作者：harlankuo
 * Copyright (c)2014版权所有--harlankuo
 */

package com.harlankuo.hyacinth.wcms.exception;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

/**
 * 类名称：CustomSimpleMappingExceptionResolver 类描述： 创建人：harlankuo 修改人：harlankuo
 * 修改时间：2014年5月4日 上午11:24:48 修改备注：@version 1.0.0
 */

public class CustomSimpleMappingExceptionResolver extends
		SimpleMappingExceptionResolver {

	@Override
	protected ModelAndView doResolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		// TODO Auto-generated method stub
		// Expose ModelAndView for chosen error view.
		String viewName = determineViewName(ex, request);
		if (viewName != null) {
			// JSP格式返回
			if (!(request.getHeader("accept").indexOf("application/json") > -1 || (request
					.getHeader("X-Requested-With") != null && request
					.getHeader("X-Requested-With").indexOf("XMLHttpRequest") > -1))) {
				// 如果不是异步请求
				// Apply HTTP status code for error views, if specified.
				// Only apply it if we're processing a top-level request.
				Integer statusCode = determineStatusCode(request, viewName);
				if (statusCode != null) {
					applyStatusCodeIfPossible(request, response, statusCode);
				}
				return getModelAndView(viewName, ex, request);
			} else {
				// JSON格式返回
				try {
					PrintWriter writer = response.getWriter();
					writer.write(ex.getMessage());
					writer.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
				return null;

			}
		} else {
			return null;
		}
	}
}
