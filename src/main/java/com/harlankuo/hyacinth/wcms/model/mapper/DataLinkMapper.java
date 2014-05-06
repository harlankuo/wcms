package com.harlankuo.hyacinth.wcms.model.mapper;

import com.harlankuo.hyacinth.wcms.model.DataLink;
import com.harlankuo.hyacinth.wcms.model.DataLinkExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DataLinkMapper extends BaseSqlMapper<DataLink> {
    int countByExample(DataLinkExample example);

    int deleteByExample(DataLinkExample example);

    int deleteByPrimaryKey(Integer linkId);

    int insert(DataLink record);

    int insertSelective(DataLink record);

    List<DataLink> selectByExample(DataLinkExample example);

    DataLink selectByPrimaryKey(Integer linkId);

    int updateByExampleSelective(@Param("record") DataLink record, @Param("example") DataLinkExample example);

    int updateByExample(@Param("record") DataLink record, @Param("example") DataLinkExample example);

    int updateByPrimaryKeySelective(DataLink record);

    int updateByPrimaryKey(DataLink record);
}