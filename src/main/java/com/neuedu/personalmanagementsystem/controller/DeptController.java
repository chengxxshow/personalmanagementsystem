package com.neuedu.personalmanagementsystem.controller;


import com.neuedu.personalmanagementsystem.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

}
