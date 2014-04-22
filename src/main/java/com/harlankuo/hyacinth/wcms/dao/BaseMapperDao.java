package com.harlankuo.hyacinth.wcms.dao;

import java.util.List;

import com.harlankuo.hyacinth.wcms.model.mapper.BaseSqlMapper;

public interface BaseMapperDao<T> {
    
    @SuppressWarnings("unchecked")
    public void setMapperClass(Class<? extends BaseSqlMapper> mapperClass);
    
    public boolean add(T entity) throws Exception;
    
    public boolean edit(T entity) throws Exception;
    
    public boolean remove(T entity) throws Exception;
    
    public T get(T entity) throws Exception;
    
    public List<T> getAll() throws Exception;
}