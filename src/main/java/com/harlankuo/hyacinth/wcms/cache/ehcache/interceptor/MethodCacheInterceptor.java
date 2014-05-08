/**
 * 项目名:Web内容管理系统
 * 包名：com.harlankuo.hyacinth.wcms.cache.ehcache.interceptor
 * 文件名：MethodCacheInterceptor.java
 * 版本信息：1.0
 * 日期：2014年5月8日-下午4:02:18
 * 作者：harlankuo
 * Copyright (c)2014版权所有--harlankuo
 */

package com.harlankuo.hyacinth.wcms.cache.ehcache.interceptor;

import java.io.Serializable;
import java.lang.reflect.Method;

import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.InitializingBean;


/**
 * 类名称：MethodCacheInterceptor 类描述： 创建人：harlankuo 修改人：harlankuo 修改时间：2014年5月8日
 * 下午4:02:18 修改备注：@version 1.0.0
 */

public class MethodCacheInterceptor implements MethodInterceptor,
		InitializingBean {

	private final Log logger = LogFactory.getLog(getClass());

	private Cache cache;

	public void setCache(Cache cache) {
		this.cache = cache;
	}

	public MethodCacheInterceptor() {
		super();
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		if (cache == null) {
			logger.error("Need a cache. Please use setCache(Cache) create it.");
		}
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.cglib.proxy.MethodInterceptor#intercept(java.lang.Object,
	 *      java.lang.reflect.Method, java.lang.Object[],
	 *      org.springframework.cglib.proxy.MethodProxy)
	 */

	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		String targetName = invocation.getThis().getClass().getName();
		String methodName = invocation.getMethod().getName();
		Object[] arguments = invocation.getArguments();
		Object result;
		logger.info("Find object from cache is " + cache.getName());
		String cacheKey = getCacheKey(targetName, methodName, arguments);
		Element element = cache.get(cacheKey);
		if (element == null) {
			logger.info("Can't find result in Cache , Get method result and create cache........!");
			result = invocation.proceed();
			element = new Element(cacheKey, (Serializable) result);
			cache.put(element);
		} else {
			logger.info("Find result in Cache , Get method result and create cache........!");
		}
		return element.getValue();
	}

	private String getCacheKey(String targetName, String methodName,
			Object[] arguments) {
		StringBuffer sb = new StringBuffer();
		sb.append(targetName).append(".").append(methodName);
		if ((arguments != null) && (arguments.length != 0)) {
			for (int i = 0; i < arguments.length; i++) {
				sb.append(".").append(arguments[i]);
			}
		}
		return sb.toString();
	}

}
