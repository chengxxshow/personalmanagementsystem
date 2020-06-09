package com.neuedu.personalmanagementsystem.controller;

import com.neuedu.personalmanagementsystem.entity.User;
import com.neuedu.personalmanagementsystem.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
   private IUserService  userService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestBody User lUser){
        System.out.println("111"+userService);
        System.out.println(lUser+"-------");
        User user=userService.getUserBynameandpsw(lUser.getUsername(),lUser.getPassword());
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
