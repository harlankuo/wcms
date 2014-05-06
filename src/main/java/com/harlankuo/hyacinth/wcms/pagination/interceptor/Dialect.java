/**
* 项目名:Web内容管理系统
* 包名：com.harlankuo.hyacinth.wcms.utils.pagination.interceptor
* 文件名：Dialect.java
* 版本信息：1.0
* 日期：2014年5月5日-下午6:00:54
* 作者：harlankuo
* Copyright (c)2014版权所有--harlankuo
*/
	
package com.harlankuo.hyacinth.wcms.pagination.interceptor;

/**
 * 类名称：Dialect
 * 类描述：
 * 创建人：harlankuo
 * 修改人：harlankuo
 * 修改时间：2014年5月5日 下午6:00:54
 * 修改备注：@version 1.0.0
 */

public abstract class Dialect {
	public   static   enum  Type{  
        MYSQL,  
        ORACLE  
    }  
      
    public   abstract  String getLimitString(String sql,  int  skipResults,  int  maxResults);  
}
