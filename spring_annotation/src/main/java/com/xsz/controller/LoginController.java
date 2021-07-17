package com.xsz.controller;

import com.xsz.annotation.LoginAnno;
import com.xsz.entity.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("login")
public class LoginController {

    @RequestMapping("reg")
    public String reg(String userName,String birthdday) {
        User user=new User();
        user.setName(userName);
        user.setBirthday(birthdday);
        return "用户[" + user +"]注册成功~!";
    }

    @RequestMapping("login")
    @LoginAnno
    public String login(String userName) {
        return "欢迎您:" + userName;
    }


    @RequestMapping("/user")
    public String addUser(@Validated @RequestBody User user, BindingResult br) {

        if (br.hasErrors()) {
            return  br.getFieldError().getDefaultMessage();
        } else {

            return "用户[" + user +"]注册成功~!";
        }
    }

}
