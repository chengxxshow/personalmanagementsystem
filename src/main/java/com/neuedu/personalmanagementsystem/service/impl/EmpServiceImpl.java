package com.neuedu.personalmanagementsystem.service.impl;


import com.neuedu.personalmanagementsystem.mapper.EmployeeMapper;
import com.neuedu.personalmanagementsystem.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EmpServiceImpl implements IEmpService {
    @Autowired
    private EmployeeMapper empMapper;
    @Override
    public int getEmpCount(String keywords) {
        return empMapper.getEmpCount(keywords);
    }

    @Override
    public List<Map<String, Object>> getEmpList(Integer page, Integer count, String keywords) {
        int start = (page - 1) * count;
        return empMapper.getEmpList(start, count, keywords);
    }
}
