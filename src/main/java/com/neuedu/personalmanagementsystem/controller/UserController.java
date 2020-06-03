package com.neuedu.personalmanagementsystem.controller;

import com.neuedu.personalmanagementsystem.entity.User;
import com.neuedu.personalmanagementsystem.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
   private IUserService  userService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(String username, String password){
        System.out.println("111"+userService);
        User user=userService.getUserBynameandpsw(username,password);
        if(user!=null){
            return "login success";
        }else{
            return "login failure";
        }

    }

    @RequestMapping("/")
    public String test(){

        return "index";
    }
}
