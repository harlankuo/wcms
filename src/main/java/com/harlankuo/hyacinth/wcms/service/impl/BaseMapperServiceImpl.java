/**
* 项目名:Web内容管理系统
* 包名：com.harlankuo.hyacinth.wcms.service.impl
* 文件名：BaseMapperServiceImpl.java
* 版本信息：1.0
* 日期：2014年4月30日-上午9:01:05
* 作者：harlankuo
* Copyright (c)2014版权所有--harlankuo
*/
	
package com.harlankuo.hyacinth.wcms.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.harlankuo.hyacinth.wcms.dao.BaseMapperDao;
import com.harlankuo.hyacinth.wcms.exception.ServiceException;
import com.harlankuo.hyacinth.wcms.service.BaseMapperService;

/**
 * 类名称：BaseMapperServiceImpl
 * 类描述：
 * 创建人：harlankuo
 * 修改人：harlankuo
 * 修改时间：2014年4月30日 上午9:01:05
 * 修改备注：@version 1.0.0
 */
@Service
public class BaseMapperServiceImpl<T> implements BaseMapperService<T> {

	@Resource(name="baseMapperDaoImpl")
	private BaseMapperDao<T> baseMapperDao;
	
	/**
	*(non-Javadoc)
	* @see com.harlankuo.hyacinth.wcms.service.BaseMapperService#add(java.lang.Object)
	*/
		
	public boolean add(T entity) throws Exception {
		// TODO Auto-generated method stub
		if(entity==null){
			throw new ServiceException("对象参数信息为Empty！");
		}
		return baseMapperDao.add(entity);
	}

	/**
	*(non-Javadoc)
	* @see com.harlankuo.hyacinth.wcms.service.BaseMapperService#edit(java.lang.Object)
	*/
		
	public boolean edit(T entity) throws Exception {
		// TODO Auto-generated method stub
		if(entity==null){
			throw new ServiceException("对象参数信息为Empty！");
		}
		return baseMapperDao.edit(entity);
	}

	/**
	*(non-Javadoc)
	* @see com.harlankuo.hyacinth.wcms.service.BaseMapperService#remove(java.lang.Object)
	*/
		
	public boolean remove(T entity) throws Exception {
		// TODO Auto-generated method stub
		if(entity==null){
			throw new ServiceException("对象参数信息为Empty！");
		}
		return baseMapperDao.remove(entity);
	}

	/**
	*(non-Javadoc)
	* @see com.harlankuo.hyacinth.wcms.service.BaseMapperService#getSingle(java.lang.Object)
	*/
		
	public T getSingle(T entity) throws Exception {
		// TODO Auto-generated method stub
		if(entity==null){
			throw new ServiceException("对象参数信息为Empty！");
		}
		return baseMapperDao.getSingle(entity);
	}

	/**
	*(non-Javadoc)
	* @see com.harlankuo.hyacinth.wcms.service.BaseMapperService#getList(java.lang.Object)
	*/
		
	public List<T> getList(T entity) throws Exception {
		// TODO Auto-generated method stub
		if(entity==null){
			throw new ServiceException("对象参数信息为Empty！");
		}
		return baseMapperDao.getList(entity);
	}

}
