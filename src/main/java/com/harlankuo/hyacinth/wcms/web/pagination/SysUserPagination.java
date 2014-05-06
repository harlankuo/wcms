/**
* 项目名:Web内容管理系统
* 包名：com.harlankuo.hyacinth.wcms.web.pagination
* 文件名：SysUserPagination.java
* 版本信息：1.0
* 日期：2014年5月5日-下午12:03:45
* 作者：harlankuo
* Copyright (c)2014版权所有--harlankuo
*/
	
package com.harlankuo.hyacinth.wcms.web.pagination;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.harlankuo.hyacinth.wcms.model.mapper.SysUserMapper;
import com.harlankuo.hyacinth.wcms.pagination.AbstractViewPage;
import com.harlankuo.hyacinth.wcms.service.BaseMapperService;
import com.harlankuo.hyacinth.wcms.service.impl.BaseMapperServiceImpl;

/**
 * 类名称：SysUserPagination
 * 类描述：继承AbstractViewPage<T>类实现父类分页和总行数的方法
 * 创建人：harlankuo
 * 修改人：harlankuo
 * 修改时间：2014年5月5日 下午12:03:45
 * 修改备注：@version 1.0.0
 */
@Component
public class SysUserPagination<T> extends AbstractViewPage<T> {

	@Resource(name="baseMapperServiceImpl")
	private BaseMapperService<T> baseMapperService;
	
	/**
	*(non-Javadoc)
	* @see com.harlankuo.hyacinth.wcms.pagination.AbstractViewPage#queryTotalRows()
	*/
		
	@Override
	protected int queryTotalRows(T entity) throws Exception {
		// TODO Auto-generated method stub
		return baseMapperService.count(entity, SysUserMapper.class);
	}

	/**
	*(non-Javadoc)
	* @see com.harlankuo.hyacinth.wcms.pagination.AbstractViewPage#queryPageList(int, int)
	*/
		
	@Override
	protected List<T> queryPageList(T entity, int startRow, int rowCount) throws Exception {
		// TODO Auto-generated method stub
		return baseMapperService.getPageList(entity, SysUserMapper.class, startRow, rowCount);
	}
}
