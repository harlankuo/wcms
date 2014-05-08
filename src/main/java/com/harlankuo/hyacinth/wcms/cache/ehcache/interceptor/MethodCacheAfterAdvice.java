/**
 * 项目名:Web内容管理系统
 * 包名：com.harlankuo.hyacinth.wcms.cache.ehcache.interceptor
 * 文件名：MethodCacheAfterAdvice.java
 * 版本信息：1.0
 * 日期：2014年5月8日-下午4:11:58
 * 作者：harlankuo
 * Copyright (c)2014版权所有--harlankuo
 */

package com.harlankuo.hyacinth.wcms.cache.ehcache.interceptor;

import java.lang.reflect.Method;
import java.util.List;

import net.sf.ehcache.Cache;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.beans.factory.InitializingBean;

/**
 * 类名称：MethodCacheAfterAdvice 类描述： 创建人：harlankuo 修改人：harlankuo 修改时间：2014年5月8日
 * 下午4:11:58 修改备注：@version 1.0.0
 */

public class MethodCacheAfterAdvice implements AfterReturningAdvice,
		InitializingBean {

	private final Log logger = LogFactory.getLog(getClass());
	private Cache cache;

	public void setCache(Cache cache) {
		this.cache = cache;
	}

	public MethodCacheAfterAdvice() {
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
	 * @see org.springframework.aop.AfterReturningAdvice#afterReturning(java.lang.Object,
	 *      java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
	 */

	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		// TODO Auto-generated method stub
		String className = arg3.getClass().getName();
		List list = cache.getKeys();
		for (int i = 0; i < list.size(); i++) {
			String cacheKey = String.valueOf(list.get(i));
			if (cacheKey.startsWith(className)) {
				cache.remove(cacheKey);
				logger.debug("remove cache " + cacheKey);
			}
		}
	}

}
