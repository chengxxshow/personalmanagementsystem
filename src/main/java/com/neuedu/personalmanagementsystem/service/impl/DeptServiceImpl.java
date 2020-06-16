package com.neuedu.personalmanagementsystem.service.impl;

import com.neuedu.personalmanagementsystem.entity.Department;
import com.neuedu.personalmanagementsystem.mapper.DepartmentMapper;
import com.neuedu.personalmanagementsystem.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class DeptServiceImpl implements IDeptService {
    @Autowired
    private DepartmentMapper deptMapper;
    @Override
    public int getDeptCount(String keywords) {
        return deptMapper.getDeptCount(keywords);
    }

    @Override
    public List<Map<String, Object>> getDeptList(Integer page, Integer count, String keywords) {
        int start = (page - 1) * count;
        return deptMapper.getDeptList(start, count, keywords);
    }

}
