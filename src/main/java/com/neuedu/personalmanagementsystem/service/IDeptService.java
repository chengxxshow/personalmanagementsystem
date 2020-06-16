package com.neuedu.personalmanagementsystem.service;


import java.util.List;
import java.util.Map;

public interface IDeptService {
    int getDeptCount(String keywords);
    List<Map<String, Object>> getDeptList(Integer page, Integer count, String keywords);

}
