/**
* 项目名:Web内容管理系统
* 包名：com.harlankuo.hyacinth.wcms.service
* 文件名：BaseMapperService.java
* 版本信息：1.0
* 日期：2014年4月30日-上午8:59:57
* 作者：harlankuo
* Copyright (c)2014版权所有--harlankuo
*/
	
package com.harlankuo.hyacinth.wcms.service;

import java.util.List;

/**
 * 类名称：BaseMapperService
 * 类描述：
 * 创建人：harlankuo
 * 修改人：harlankuo
 * 修改时间：2014年4月30日 上午8:59:57
 * 修改备注：@version 1.0.0
 */

public interface BaseMapperService<T> {
	
    public boolean add(T entity) throws Exception;
    
    public boolean edit(T entity) throws Exception;
    
    public boolean remove(T entity) throws Exception;
    
    public T getSingle(T entity) throws Exception;

    public List<T> getList(T entity) throws Exception;
}
