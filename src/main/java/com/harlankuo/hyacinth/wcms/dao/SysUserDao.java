package com.harlankuo.hyacinth.wcms.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.harlankuo.hyacinth.wcms.model.SysUser;

@SuppressWarnings({"unused" })
public interface SysUserDao<T extends SysUser> extends BaseMapperDao<T> {
	public Boolean Login(T entity) throws DataAccessException;
}
