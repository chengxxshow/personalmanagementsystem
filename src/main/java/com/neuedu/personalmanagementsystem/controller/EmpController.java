package com.neuedu.personalmanagementsystem.controller;


import com.neuedu.personalmanagementsystem.entity.Employee;
import com.neuedu.personalmanagementsystem.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/emp")
public class EmpController {
    @Autowired
   private IEmpService empService;


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getUserList(@RequestParam(value = "page", defaultValue = "1") Integer page,
                                           @RequestParam(value = "count", defaultValue = "10") Integer count, String keywords) {
        int totalCount = empService.getEmpCount(keywords);
        List<Map<String,Object>> list = empService.getEmpList( page, count,keywords);
        Map<String, Object> map = new HashMap<>();
        map.put("totalCount", totalCount);
        map.put("list", list);

        return map;
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String addNewEmp(@RequestBody Employee emp) {
        System.out.println(emp+"----------j");
        Map<String, Object> map = new HashMap<>();
        int result = empService.addEmp(emp);
        if (result == 1) {
         return "添加成功!";
        }else{
          return "添加失败!";
        }

    }
}