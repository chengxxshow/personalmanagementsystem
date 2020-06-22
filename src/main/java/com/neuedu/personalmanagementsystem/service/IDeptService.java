package com.neuedu.personalmanagementsystem.service;


import com.neuedu.personalmanagementsystem.entity.Department;

import java.util.List;
import java.util.Map;

public interface IDeptService {
    int getDeptCount(String keywords);
    List<Map<String, Object>> getDeptList(Integer page, Integer count, String keywords);

    int addDept(Department dept);

    int updatDeptById(Department dept);

    boolean deleteDeptByIds(String ids);
}
