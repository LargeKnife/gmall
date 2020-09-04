package com.edward.gmall.user.controller;

import com.edward.gmall.user.bean.UmsMember;
import com.edward.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ChenGuiHong
 * @create 2020-09-04  11:45
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/index")
    @ResponseBody

    public String hello(){
        return "hello";
    }

    @RequestMapping("/getAll")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember>  list = userService.getAllUser();
        return list;
    }
}
