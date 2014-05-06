/**
* 项目名:Web内容管理系统
* 包名：com.harlankuo.hyacinth.wcms.utils.pagination.interceptor
* 文件名：MysqlDialect.java
* 版本信息：1.0
* 日期：2014年5月6日-上午9:16:58
* 作者：harlankuo
* Copyright (c)2014版权所有--harlankuo
*/
	
package com.harlankuo.hyacinth.wcms.pagination.interceptor;

/**
 * 类名称：MysqlDialect
 * 类描述：
 * 创建人：harlankuo
 * 修改人：harlankuo
 * 修改时间：2014年5月6日 上午9:16:58
 * 修改备注：@version 1.0.0
 */

public class MysqlDialect extends Dialect {
	
	protected static final String SQL_END_DELIMITER = ";";
	
	public String getLimitString(String sql, boolean hasOffset) {
		return MySql5PageHepler.getLimitString(sql,-1,-1);
	}

	public String getLimitString(String sql, int offset, int limit) {
		return MySql5PageHepler.getLimitString(sql, offset, limit);
	}

	public boolean supportsLimit() {
		return true;
	}

}
