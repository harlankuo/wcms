package com.harlankuo.hyacinth.wcms.service;

import java.util.List;
import org.springframework.dao.DataAccessException;

public interface SysUserService<T> {
	
	public List<T> getList() throws DataAccessException;
	public T getAccount(Integer id) throws DataAccessException;
	public boolean addAccount(T entity) throws DataAccessException;
}
