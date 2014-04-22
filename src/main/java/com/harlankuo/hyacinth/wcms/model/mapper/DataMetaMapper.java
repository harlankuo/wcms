package com.harlankuo.hyacinth.wcms.model.mapper;

import com.harlankuo.hyacinth.wcms.model.DataMeta;
import com.harlankuo.hyacinth.wcms.model.DataMetaExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DataMetaMapper extends BaseSqlMapper {
    int countByExample(DataMetaExample example);

    int deleteByExample(DataMetaExample example);

    int deleteByPrimaryKey(Integer metaId);

    int insert(DataMeta record);

    int insertSelective(DataMeta record);

    List<DataMeta> selectByExample(DataMetaExample example);

    DataMeta selectByPrimaryKey(Integer metaId);

    int updateByExampleSelective(@Param("record") DataMeta record, @Param("example") DataMetaExample example);

    int updateByExample(@Param("record") DataMeta record, @Param("example") DataMetaExample example);

    int updateByPrimaryKeySelective(DataMeta record);

    int updateByPrimaryKey(DataMeta record);
}