package com.neuedu.personalmanagementsystem.controller;

import com.neuedu.personalmanagementsystem.entity.User;
import com.neuedu.personalmanagementsystem.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
   private IUserService  userService;
/*
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

    }*/

    @RequestMapping("/login")
    @ResponseBody
    public User login(@RequestBody User lUser, HttpSession session){
        System.out.println("111"+userService);
        System.out.println(lUser+"---come from front----");
        User user=userService.getUserBynameandpsw(lUser.getUsername(),lUser.getPassword());
        System.out.println(user+"---back to front----");
        // success login in  store current user to session
        if(user!=null){
            session.setAttribute("userInfo",user);
        }
        return user;
    }
    @RequestMapping("/loginOut")
    @ResponseBody
    public void userloginOut(HttpSession session){
         session.invalidate();
       // session.removeAttribute("userInfo");
       // session.setAttribute("userInfo",null);
    }
    public String test(){
        return "index";
    }

}
