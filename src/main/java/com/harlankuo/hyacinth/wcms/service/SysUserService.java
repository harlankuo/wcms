package com.harlankuo.hyacinth.wcms.service;

import com.harlankuo.hyacinth.wcms.exception.BusinessException;
import com.harlankuo.hyacinth.wcms.model.SysUser;

public interface SysUserService<T extends SysUser> extends BaseMapperService<T> {
	public Boolean Login(T entity) throws BusinessException;
}
