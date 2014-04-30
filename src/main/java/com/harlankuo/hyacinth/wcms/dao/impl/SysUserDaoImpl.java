package com.harlankuo.hyacinth.wcms.dao.impl;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.harlankuo.hyacinth.wcms.dao.SysUserDao;
import com.harlankuo.hyacinth.wcms.model.SysUser;
import com.harlankuo.hyacinth.wcms.model.mapper.BaseSqlMapper;
import com.harlankuo.hyacinth.wcms.model.mapper.SysUserMapper;

@SuppressWarnings("unchecked")
@Repository
public class SysUserDaoImpl<T extends SysUser> extends BaseMapperDaoImpl<T> implements SysUserDao<T> {

	/**
	* 创建一个新的实例 SysUserDaoImpl.
	* @param sqlSessionFactory
	*/
	@Inject
	public SysUserDaoImpl(SqlSessionFactory sqlSessionFactory) {
		super(sqlSessionFactory);
		super.setMapperClass(SysUserMapper.class);
		// TODO Auto-generated constructor stub
	}

	@Inject
    private SysUserMapper mapper;

	/**
	*(non-Javadoc)
	* @see com.harlankuo.hyacinth.wcms.dao.SysUserDao#Login(com.harlankuo.hyacinth.wcms.model.SysUser)
	*/
		
	public Boolean Login(T entity) throws DataAccessException {
		// TODO Auto-generated method stub
		if(super.getMapper(SysUserMapper.class).Login(entity)==null){
			return false;
		}else {
			return true;
		}
	}

	

}
