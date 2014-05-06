package com.harlankuo.hyacinth.wcms.model.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.dao.DataAccessException;

/**
 * <b>function:</b> BaseSqlMapper继承SqlMapper，对Mapper进行接口封装，提供常用的增删改查组件；
 * 也可以对该接口进行扩展和封装
 * @author harlankuo
 * @createDate 
 * @file BaseSqlMapper.java
 * @package 
 * @project
 * @blog 
 * @email 
 * @version 1.0
 */
public interface BaseSqlMapper<T> extends SqlMapper {
	public void add(T entity) throws DataAccessException;
    
    public void edit(T entity) throws DataAccessException;
    
    public void remove(T entity) throws DataAccessException;
    
    public T getSingle(T entity) throws DataAccessException;
    
    public List<T> getList(T entity) throws DataAccessException;
    
    public List<T> getPageList(T entity, RowBounds rowBounds) throws DataAccessException;
    
    public List<T> getAllList() throws DataAccessException;
    
    public int count(T entity) throws DataAccessException;
}
