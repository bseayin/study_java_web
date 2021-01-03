package com.xsz.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${myversion}")
    String version;

    /**
     * 第一个controller, @RequestMapping("/hello") 设置了拦截路径是 hello
     * @return
     */
    @RequestMapping("/hello")
    public String test1() {
        return "hello springboot2 ";
    }


    @RequestMapping("/server")
    public String testintegration() {
        return "from integration http demo server ";
    }

    /**
     *   @Value("${myversion}") 获取配置文件上的自定义属性的值
     * @return
     */
    @RequestMapping("/hello2")
    public String test2() {
        return "hello springboot2 "+version;
    }



}
