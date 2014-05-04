package com.harlankuo.hyacinth.wcms.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.harlankuo.hyacinth.wcms.dao.SysUserDao;
import com.harlankuo.hyacinth.wcms.exception.BusinessException;
import com.harlankuo.hyacinth.wcms.model.SysUser;
import com.harlankuo.hyacinth.wcms.service.SysUserService;

@Service
public class SysUserServiceImpl<T extends SysUser> extends BaseMapperServiceImpl<T> implements SysUserService<T> {

	@Resource(name="sysUserDaoImpl")
    private SysUserDao<T> sysUserDao;

	/**
	*(non-Javadoc)
	* @see com.harlankuo.hyacinth.wcms.service.SysUserService#Login(java.lang.Object)
	*/
		
	public Boolean Login(T entity) throws BusinessException {
		// TODO Auto-generated method stub
		if(entity==null){
			throw new BusinessException("对象参数信息为Empty！");
		}
		return sysUserDao.Login(entity);
	}

}
