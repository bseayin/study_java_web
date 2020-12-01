package com.xsz.controller;


import com.xsz.mapper.ResourceDataMapper;
import com.xsz.model.ResourceData;

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
    ResourceDataMapper resourceRepository;

    @RequestMapping("addresource")
    public  String add(ResourceData resourceData){
        resourceRepository.insert(resourceData);
//        resourceRepository.save(resourceData);
        return "/aindex.html";
    }

//    @RequestMapping("allresource")
//    @ResponseBody
//    public List<ResourceData> getAll(ResourceData resourceData){
//
//        return  resourceRepository.findAll();
//    }

    @RequestMapping("deleteResource/{id}")
    @ResponseBody
    public Map deleteResource(@PathVariable("id") int rid){
        resourceRepository.deleteByPrimaryKey(rid);
//        resourceRepository.deleteById(rid);
        HashMap rs=new HashMap();
        rs.put("result","删除成功");
        return  rs;
    }
}