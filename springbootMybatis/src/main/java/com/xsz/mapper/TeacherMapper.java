package com.xsz.mapper;

import com.xsz.model.Teacher;

import java.util.List;

public interface TeacherMapper {
    int deleteByPrimaryKey(String tId);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
    List<Teacher> selectAll();

}