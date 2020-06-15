package com.neuedu.personalmanagementsystem.service;

import com.neuedu.personalmanagementsystem.entity.User;

import java.util.List;
import java.util.Map;

public interface IEmpService {
    public int getEmpCount(String keywords);
    public List<Map<String, Object>> getEmpList(Integer page, Integer count, String keywords);
}
