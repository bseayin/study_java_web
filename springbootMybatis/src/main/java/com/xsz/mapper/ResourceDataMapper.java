package com.xsz.mapper;

import com.xsz.model.ResourceData;

public interface ResourceDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResourceData record);

    int insertSelective(ResourceData record);

    ResourceData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResourceData record);

    int updateByPrimaryKey(ResourceData record);
}