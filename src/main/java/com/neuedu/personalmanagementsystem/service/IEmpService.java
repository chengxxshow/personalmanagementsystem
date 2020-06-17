package com.neuedu.personalmanagementsystem.service;



import com.neuedu.personalmanagementsystem.entity.Employee;

import java.util.List;
import java.util.Map;

public interface IEmpService {
    int getEmpCount(String keywords);
    List<Map<String, Object>> getEmpList(Integer page, Integer count, String keywords);

    int addEmp(Employee emp);

    int updateEmpById(Employee emp);

    boolean deleteEmpByIds(String ids);
}
