package com.xsz.controller;

import com.xsz.entity.ResourceData;
import com.xsz.repository.ResourceRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ResourceController {
    @Resource
    ResourceRepository resourceRepository;

    @RequestMapping("addresource")
    public  String add(ResourceData resourceData){
        /**
         * save方法是比较特殊的方法，
         * 1，如果传入的对象，主键没有值，就执行insert 语句（sql）
         * 2.如果传入对象，主键有值，就执行update 语句
         */
        resourceRepository.save(resourceData);
        return "/aindex.html";
    }

    @RequestMapping("allresource")
    @ResponseBody
    public List<ResourceData> getAll(ResourceData resourceData){
        return  resourceRepository.findAll();
    }

    @RequestMapping("deleteResource/{id}")
    @ResponseBody
    public Map deleteResource(@PathVariable("id") int rid){
        resourceRepository.deleteById(rid);
        HashMap rs=new HashMap();
        rs.put("result","删除成功");
        return  rs;
    }

    @RequestMapping("getResource/{id}")
    @ResponseBody
    public ResourceData getResource(@PathVariable("id") String rid){
        /**
         * substring 表示截取
         * 如果只放一个参数，就表示截取的起点下标,终点就是末尾
         * 比如： String a="abc";
         * a.substring(1)
         * Integer.parseInt(rid); String 转 Int
         */
        rid=rid.substring(1);
        int id=Integer.parseInt(rid);
        return  resourceRepository.findById(id).get();
    }
}
