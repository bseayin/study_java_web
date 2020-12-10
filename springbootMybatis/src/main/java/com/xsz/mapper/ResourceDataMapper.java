package com.xsz.mapper;

import com.xsz.model.ResourceData;

import java.util.List;

public interface ResourceDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResourceData record);

    int insertSelective(ResourceData record);

    ResourceData selectByPrimaryKey(Integer id);

    List<ResourceData> selectAll();
    List<ResourceData> selectByType(String type);


    int updateByPrimaryKeySelective(ResourceData record);

    int updateByPrimaryKey(ResourceData record);
}