package com.harlankuo.hyacinth.wcms.model.mapper;

import com.harlankuo.hyacinth.wcms.model.DataBaseInfo;
import com.harlankuo.hyacinth.wcms.model.DataBaseInfoExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DataBaseInfoMapper extends BaseSqlMapper {
	
    int countByExample(DataBaseInfoExample example);

    int deleteByExample(DataBaseInfoExample example);

    int deleteByPrimaryKey(Integer baseinfoId);

    int insert(DataBaseInfo record);

    int insertSelective(DataBaseInfo record);

    List<DataBaseInfo> selectByExample(DataBaseInfoExample example);

    DataBaseInfo selectByPrimaryKey(Integer baseinfoId);

    int updateByExampleSelective(@Param("record") DataBaseInfo record, @Param("example") DataBaseInfoExample example);

    int updateByExample(@Param("record") DataBaseInfo record, @Param("example") DataBaseInfoExample example);

    int updateByPrimaryKeySelective(DataBaseInfo record);

    int updateByPrimaryKey(DataBaseInfo record);
}