package com.harlankuo.hyacinth.wcms.model.mapper;

import com.harlankuo.hyacinth.wcms.model.SysUser;
import com.harlankuo.hyacinth.wcms.model.SysUserExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.dao.DataAccessException;

public interface SysUserMapper extends BaseSqlMapper {
	public SysUser Login(SysUser sysUser) throws DataAccessException;
}