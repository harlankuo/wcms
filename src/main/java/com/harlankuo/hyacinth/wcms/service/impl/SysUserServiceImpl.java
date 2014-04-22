package com.harlankuo.hyacinth.wcms.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.harlankuo.hyacinth.wcms.dao.SysUserDao;
import com.harlankuo.hyacinth.wcms.model.SysUser;
import com.harlankuo.hyacinth.wcms.service.SysUserService;

public class SysUserServiceImpl<T extends SysUser> implements SysUserService<T> {

	@Inject
    private SysUserDao<T> dao;
	
	public List<T> getList() throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	public T getAccount(Integer id) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean addAccount(T entity) throws DataAccessException {
		// TODO Auto-generated method stub
		return false;
	}

}
