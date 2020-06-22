package com.neuedu.personalmanagementsystem.mapper;

import com.neuedu.personalmanagementsystem.entity.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);

    int getDeptCount(String keywords);

    List<Map<String, Object>> getDeptList(int start, Integer count, String keywords);

    int deleteDeptByIds(@Param("ids") String[] ids);
}