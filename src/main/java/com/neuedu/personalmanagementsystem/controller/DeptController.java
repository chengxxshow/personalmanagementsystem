package com.neuedu.personalmanagementsystem.controller;


import com.neuedu.personalmanagementsystem.entity.Department;
import com.neuedu.personalmanagementsystem.entity.Employee;
import com.neuedu.personalmanagementsystem.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/dept")
public class DeptController {
    @Autowired
   private IDeptService deptService;


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getDeptList(@RequestParam(value = "page", defaultValue = "1") Integer page,
                                           @RequestParam(value = "count", defaultValue = "10") Integer count, String keywords) {
        int totalCount = deptService.getDeptCount(keywords);
        List<Map<String,Object>> list = deptService.getDeptList( page, count,keywords);
        Map<String, Object> map = new HashMap<>();
        map.put("totalCount", totalCount);
        map.put("list", list);

        return map;
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String addNewDept(@RequestBody Department dept) {
        System.out.println(dept+"----------j");
        Map<String, Object> map = new HashMap<>();
        int result = deptService.addDept(dept);
        if (result == 1) {
            return "添加成功!";
        }else{
            return "添加失败!";
        }

    }

    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    @ResponseBody
    public String updateDeptById(@RequestBody  Department dept) {
        System.out.println(dept+"----------j");
        int i = deptService.updatDeptById(dept);
        if (i == 1) {
            return "修改成功!";
        }else{
            return "修改失败!";
        }

    }

    @RequestMapping(value = "/delById", method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteDeptByIds(@RequestParam String ids) {
        boolean result = deptService.deleteDeptByIds(ids);
        if (result) {
            return "删除成功";
        }
        return "删除失败";
    }

}
