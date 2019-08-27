package com.example.controller;

import com.example.entity.UserEntity;
import com.example.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping("get")
    public void getUserInfo(){
        UserEntity userInfo = userServiceImpl.getUserInfo();
        System.out.println(userInfo);

    }

}
