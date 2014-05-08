/**
 * 项目名:Web内容管理系统
 * 包名：com.harlankuo.hyacinth.wcms.cache.ehcache
 * 文件名：EHCacheComponent.java
 * 版本信息：1.0
 * 日期：2014年5月8日-下午4:19:30
 * 作者：harlankuo
 * Copyright (c)2014版权所有--harlankuo
 */

package com.harlankuo.hyacinth.wcms.cache.ehcache;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

/**
 * 类名称：EHCacheComponent 类描述： 该类中的方法就是一个从缓存里找信息的类。
 * 创建人：harlankuo 修改人：harlankuo 修改时间：2014年5月8日
 * 下午4:19:30 修改备注：@version 1.0.0
 */
@Component
public class EHCacheComponent {
	protected final Log logger = LogFactory.getLog(getClass());

	/*@Resource
	private ICommonService commonService;

	public List<CountryDBO> cacheFindCountry() throws Exception {
		return commonService.getCountriesForMake();
	}*/
}
