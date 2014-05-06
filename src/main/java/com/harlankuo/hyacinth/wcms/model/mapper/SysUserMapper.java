package com.harlankuo.hyacinth.wcms.model.mapper;

import com.harlankuo.hyacinth.wcms.model.SysUser;

import org.springframework.dao.DataAccessException;

public interface SysUserMapper extends BaseSqlMapper<SysUser> {
	public SysUser Login(SysUser sysUser) throws DataAccessException;
}