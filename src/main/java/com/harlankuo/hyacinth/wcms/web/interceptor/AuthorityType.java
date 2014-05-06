/**
* 项目名:Web内容管理系统
* 包名：com.harlankuo.hyacinth.wcms.web
* 文件名：AuthorityType.java
* 版本信息：1.0
* 日期：2014年4月24日-下午1:57:44
* 作者：harlankuo
* Copyright (c)2014版权所有--harlankuo
*/
	
package com.harlankuo.hyacinth.wcms.web.interceptor;

/**
 * 类名称：AuthorityType
 * 类描述：
 * 创建人：harlankuo
 * 修改人：harlankuo
 * 修改时间：2014年4月24日 下午1:57:44
 * 修改备注：@version 1.0.0
 */

public enum AuthorityType {
	SALES_ORDER_CREATE("创建订单", 0), 
	SALES_ORDER_FIND("查看订单", 1),
	SALES_ORDER_MODIFY("修改订单", 2),
	SALES_ORDER_DELETE("删除订单", 3),

	;
	private String name;
	private int index;

	private AuthorityType(String name, int index) {
		this.name = name;
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
