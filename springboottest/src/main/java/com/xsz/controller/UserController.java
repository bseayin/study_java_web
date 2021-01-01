package com.xsz.controller;

import com.xsz.mapper.UserMapper;
import com.xsz.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    UserMapper userMapper;

    @RequestMapping("login")
    public String login(User user){
        System.out.println("页面选择角色*****"+user.getRole());
        User user1=userMapper.selectByNameAndPwd(user);
        if(user1!=null){
            if("管理员".equals(user.getRole())){
                return "/aindex.html";
            }else{
                return "/resourcetable2.html";
            }

        }else{
            return "/login2.html";
        }

    }
}
