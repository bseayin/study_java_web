package com.xsz.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("test")
public class TestController2 {

    //路径传值
    @RequestMapping("t1/{p1}")
    public Map t1(@PathVariable("p1") String paramter1){
        Map map=new HashMap();
        map.put("rs",paramter1+"**hello");
        return  map;
    }
    //? 传值
    @RequestMapping("t2")
    public Map t2(@RequestParam("p1") String paramter1)
    {
        System.out.println(paramter1);
        Map map=new HashMap();
        map.put("rs",paramter1);
        return  map;
    }

    //Body参数
//application/jason
    @RequestMapping("t3")
    public Map t3(@RequestBody ResourceData resourceData){

        Map map=new HashMap();
        map.put("rs",resourceData.getContent());
        return  map;
    }
    //	无注解（form提交）
    //form-data
    @RequestMapping("t4")
    public Map t4(ResourceData resourceData){

        Map map=new HashMap();
        map.put("rs",resourceData.getContent());
        return  map;
    }

    //	请求头参数以及Cookie
    @RequestMapping("t5")
    public Map t5(@RequestHeader(name ="myHeader") String myHeader,
                  @CookieValue(name = "myCookie") String myCookie){
        System.out.println("myHeader=" + myHeader);
        System.out.println("myCookie=" + myCookie);
        Map map=new HashMap();
        map.put("rs",myHeader);
        return  map;
    }

    //	表单的参数写在Controller相应的方法的形参中
//	适用于get方式提交，不适用于post方式提交。
    @RequestMapping("t6")
    public Map t6(String content,String type){

        Map map=new HashMap();
        map.put("rs",content);
        return  map;
    }
}
