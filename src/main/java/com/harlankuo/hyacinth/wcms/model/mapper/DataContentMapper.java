package com.harlankuo.hyacinth.wcms.model.mapper;

import com.harlankuo.hyacinth.wcms.model.DataContent;
import com.harlankuo.hyacinth.wcms.model.DataContentExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DataContentMapper extends BaseSqlMapper {
    int countByExample(DataContentExample example);

    int deleteByExample(DataContentExample example);

    int deleteByPrimaryKey(Integer contentId);

    int insert(DataContent record);

    int insertSelective(DataContent record);

    List<DataContent> selectByExampleWithBLOBs(DataContentExample example);

    List<DataContent> selectByExample(DataContentExample example);

    DataContent selectByPrimaryKey(Integer contentId);

    int updateByExampleSelective(@Param("record") DataContent record, @Param("example") DataContentExample example);

    int updateByExampleWithBLOBs(@Param("record") DataContent record, @Param("example") DataContentExample example);

    int updateByExample(@Param("record") DataContent record, @Param("example") DataContentExample example);

    int updateByPrimaryKeySelective(DataContent record);

    int updateByPrimaryKeyWithBLOBs(DataContent record);

    int updateByPrimaryKey(DataContent record);
}