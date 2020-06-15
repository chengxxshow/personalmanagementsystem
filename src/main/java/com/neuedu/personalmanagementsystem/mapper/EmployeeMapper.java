package com.neuedu.personalmanagementsystem.mapper;

import com.neuedu.personalmanagementsystem.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface EmployeeMapper {

    public int getEmpCount(String keywords);

    public List<Map<String, Object>> getEmpList(int start, Integer count, String keywords);

    int deleteByPrimaryKey(Integer empId);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer empId);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}