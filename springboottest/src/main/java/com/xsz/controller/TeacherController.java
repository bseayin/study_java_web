package com.xsz.controller;

import com.xsz.mapper.ResourceDataMapper;
import com.xsz.mapper.TeacherMapper;
import com.xsz.model.ResourceData;
import com.xsz.model.Teacher;
import com.xsz.util.KeyUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TeacherController {
    @Resource
    TeacherMapper teacherMapper;

    @RequestMapping("addTeacher")
    public  String add(Teacher teacher){
        if(teacher.gettId()!=null){
            teacherMapper.updateByPrimaryKeySelective(teacher);
        }else{
            String id= KeyUtil.genUniqueKey();
            teacher.settId(id);
            teacherMapper.insert(teacher);
        }

//        resourceRepository.save(resourceData);
        return "/aindex3.html";
    }

    @RequestMapping("allTeacher")
    @ResponseBody
    public List<Teacher> getAll(){

        return  teacherMapper.selectAll();
    }

    @RequestMapping("deleteTeacher/{id}")
    @ResponseBody
    public Map delete(@PathVariable("id") String rid){
        teacherMapper.deleteByPrimaryKey(rid);
//        resourceRepository.deleteById(rid);
        HashMap rs=new HashMap();
        rs.put("result","删除成功");
        return  rs;
    }

    @RequestMapping("getTeacher/{id}")
    @ResponseBody
    public Teacher getById(@PathVariable("id") String rid){
        /**
         * substring 表示截取
         * 如果只放一个参数，就表示截取的起点下标,终点就是末尾
         * 比如： String a="abc";
         * a.substring(1)
         * Integer.parseInt(rid); String 转 Int
         */
        rid=rid.substring(1);
//        int id=Integer.parseInt(rid);
        return  teacherMapper.selectByPrimaryKey(rid);
    }
}
