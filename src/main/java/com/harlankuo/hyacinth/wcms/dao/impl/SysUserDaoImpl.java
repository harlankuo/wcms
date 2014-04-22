package com.harlankuo.hyacinth.wcms.dao.impl;

import java.util.List;
import javax.inject.Inject;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.harlankuo.hyacinth.wcms.dao.SysUserDao;
import com.harlankuo.hyacinth.wcms.model.SysUser;
import com.harlankuo.hyacinth.wcms.model.mapper.SysUserMapper;

public class SysUserDaoImpl<T extends SysUser> implements SysUserDao<T> {

	@Inject
    private SysUserMapper mapper;
	
	public boolean addAccount(T entity) throws DataAccessException {
		// TODO Auto-generated method stub
		return false;
	}

	public T getAccount(Integer id) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> getList() throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

}
