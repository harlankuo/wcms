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

import org.springframework.stereotype.Service;

import com.harlankuo.hyacinth.wcms.dao.BaseMapperDao;
import com.harlankuo.hyacinth.wcms.exception.BusinessException;
import com.harlankuo.hyacinth.wcms.model.mapper.BaseSqlMapper;
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
		
	public boolean add(T entity, Class<? extends BaseSqlMapper> mapperClass) throws Exception {
		// TODO Auto-generated method stub
		if(entity==null){
			throw new BusinessException("对象参数信息为Empty！");
		}
		baseMapperDao.setMapperClass(mapperClass);
		return baseMapperDao.add(entity);
	}

	/**
	*(non-Javadoc)
	* @see com.harlankuo.hyacinth.wcms.service.BaseMapperService#edit(java.lang.Object)
	*/
		
	public boolean edit(T entity, Class<? extends BaseSqlMapper> mapperClass) throws Exception {
		// TODO Auto-generated method stub
		if(entity==null){
			throw new BusinessException("对象参数信息为Empty！");
		}
		baseMapperDao.setMapperClass(mapperClass);
		return baseMapperDao.edit(entity);
	}

	/**
	*(non-Javadoc)
	* @see com.harlankuo.hyacinth.wcms.service.BaseMapperService#remove(java.lang.Object)
	*/
		
	public boolean remove(T entity, Class<? extends BaseSqlMapper> mapperClass) throws Exception {
		// TODO Auto-generated method stub
		if(entity==null){
			throw new BusinessException("对象参数信息为Empty！");
		}
		baseMapperDao.setMapperClass(mapperClass);
		return baseMapperDao.remove(entity);
	}

	/**
	*(non-Javadoc)
	* @see com.harlankuo.hyacinth.wcms.service.BaseMapperService#getSingle(java.lang.Object)
	*/
		
	public T getSingle(T entity, Class<? extends BaseSqlMapper> mapperClass) throws Exception {
		// TODO Auto-generated method stub
		if(entity==null){
			throw new BusinessException("对象参数信息为Empty！");
		}
		baseMapperDao.setMapperClass(mapperClass);
		return baseMapperDao.getSingle(entity);
	}

	/**
	*(non-Javadoc)
	* @see com.harlankuo.hyacinth.wcms.service.BaseMapperService#getList(java.lang.Object)
	*/
		
	public List<T> getList(T entity, Class<? extends BaseSqlMapper> mapperClass) throws Exception {
		// TODO Auto-generated method stub
		if(entity==null){
			throw new BusinessException("对象参数信息为Empty！");
		}
		baseMapperDao.setMapperClass(mapperClass);
		return baseMapperDao.getList(entity);
	}

	/**
	*(non-Javadoc)
	* @see com.harlankuo.hyacinth.wcms.service.BaseMapperService#getPageList(java.lang.Object, int, int)
	*/
		
	public List<T> getPageList(T entity, Class<? extends BaseSqlMapper> mapperClass, int startRow, int rowCount)
			throws Exception {
		// TODO Auto-generated method stub
		if(entity==null){
			throw new BusinessException("对象参数信息为Empty！");
		}
		baseMapperDao.setMapperClass(mapperClass);
		return baseMapperDao.getPageList(entity, startRow, rowCount);
	}

	/**
	*(non-Javadoc)
	* @see com.harlankuo.hyacinth.wcms.service.BaseMapperService#getAllList()
	*/
		
	public List<T> getAllList(Class<? extends BaseSqlMapper> mapperClass) throws Exception {
		// TODO Auto-generated method stub
		baseMapperDao.setMapperClass(mapperClass);
		return baseMapperDao.getAllList();
	}

	/**
	*(non-Javadoc)
	* @see com.harlankuo.hyacinth.wcms.service.BaseMapperService#count(java.lang.Object)
	*/
		
	public int count(T entity, Class<? extends BaseSqlMapper> mapperClass) throws Exception {
		// TODO Auto-generated method stub
		if(entity==null){
			throw new BusinessException("对象参数信息为Empty！");
		}
		baseMapperDao.setMapperClass(mapperClass);
		return baseMapperDao.count(entity);
	}

}
