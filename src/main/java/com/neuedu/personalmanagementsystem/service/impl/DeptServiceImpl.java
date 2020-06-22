package com.neuedu.personalmanagementsystem.service.impl;

import com.neuedu.personalmanagementsystem.entity.Department;
import com.neuedu.personalmanagementsystem.mapper.DepartmentMapper;
import com.neuedu.personalmanagementsystem.mapper.EmployeeMapper;
import com.neuedu.personalmanagementsystem.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
@Service
public class DeptServiceImpl implements IDeptService {
    @Autowired
    private DepartmentMapper deptMapper;
    @Autowired
    private EmployeeMapper empMapper;
    @Override
    public int getDeptCount(String keywords) {
        return deptMapper.getDeptCount(keywords);
    }

    @Override
    public List<Map<String, Object>> getDeptList(Integer page, Integer count, String keywords) {
        int start = (page - 1) * count;
        return deptMapper.getDeptList(start, count, keywords);
    }

    @Override
    public int addDept(Department dept) {
        return deptMapper.insertSelective(dept);
    }

    @Override
    public int updatDeptById(Department dept) {
        return deptMapper.updateByPrimaryKeySelective(dept);
    }

    @Transactional(value="txManager1")
    @Override
    public boolean deleteDeptByIds(String ids) {
        String[] split = ids.split(",");
        //批量修改员工所在部门为null
        int r1= empMapper.updateEmpByIds(split);
        int r2 = deptMapper.deleteDeptByIds(split);
        return r2 == split.length;
    }

}
