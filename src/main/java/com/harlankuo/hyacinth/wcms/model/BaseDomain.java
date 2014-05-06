/**
* 项目名:Web内容管理系统
* 包名：com.harlankuo.hyacinth.wcms.entity
* 文件名：BaseDomain.java
* 版本信息：1.0
* 日期：2014年4月30日-下午5:23:32
* 作者：harlankuo
* Copyright (c)2014版权所有--harlankuo
*/
	
package com.harlankuo.hyacinth.wcms.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 类名称：BaseDomain
 * 类描述：所有实体类的基类，并提供一个统一的toString方法
 * 创建人：harlankuo
 * 修改人：harlankuo
 * 修改时间：2014年4月30日 下午5:23:32
 * 修改备注：@version 1.0.0
 */

public class BaseDomain implements Serializable {
	/**
	* serialVersionUID:TODO（用一句话描述这个变量表示什么）
	*
	* @ 1.0.0
	*/
		
	private static final long serialVersionUID = 1L;

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
