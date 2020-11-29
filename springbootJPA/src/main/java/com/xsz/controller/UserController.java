package com.xsz.controller;

import com.xsz.entity.User;
import com.xsz.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    UserRepository userRepository;

    @RequestMapping("register")
    public String register(User user){
        user.setRole("普通用户");
        userRepository.save(user);
        return "/login2.html";
    }

    @RequestMapping("login")
    public String login(User user){
        System.out.println("页面选择角色*****"+user.getRole());
        User user1=userRepository.findByUserNameAndPasswordAndRole(user.getUserName(),user.getPassword(),user.getRole());
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
