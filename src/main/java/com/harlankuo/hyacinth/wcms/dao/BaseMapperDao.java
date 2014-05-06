package com.harlankuo.hyacinth.wcms.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.harlankuo.hyacinth.wcms.model.mapper.BaseSqlMapper;

@SuppressWarnings({ "unchecked", "unused" })
public interface BaseMapperDao<T> {
    
    public void setMapperClass(Class<? extends BaseSqlMapper> mapperClass);
    
    public boolean add(T entity) throws Exception;
    
    public boolean edit(T entity) throws Exception;
    
    public boolean remove(T entity) throws Exception;
    
    public T getSingle(T entity) throws Exception;

    public List<T> getList(T entity) throws Exception;
    
    public List<T> getPageList(T entity, int startRow, int rowCount) throws Exception;
    
    public List<T> getAllList() throws Exception;
    
    public int count(T entity) throws Exception;
}
