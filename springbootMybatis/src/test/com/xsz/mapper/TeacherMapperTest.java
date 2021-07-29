package com.xsz.mapper;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TeacherMapperTest  {
    @Resource
    TeacherMapper teacherMapper;
    @Test
    public void testSelectByPrimaryKey() {
        teacherMapper.selectByPrimaryKey("1");
    }
    @Test
    public void testSelectByPrimaryKey2() {
    }
}