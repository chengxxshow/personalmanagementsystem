package com.neuedu.personalmanagementsystem.mapper;

import com.neuedu.personalmanagementsystem.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
    //login
    public User getUserBynameandpsw(@Param("uname")String username, @Param("psw")String password);
    //select all user by  somme key
    public List<User> getAllUserBykey(@Param("keystr")String key);
    //update user info.
    public int updateUser(User user);
    //delete a user
    public int delUserbyId(int id);


    // ...
}
