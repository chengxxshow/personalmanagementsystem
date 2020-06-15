package com.neuedu.personalmanagementsystem.service;

import com.neuedu.personalmanagementsystem.entity.User;

import java.util.List;
import java.util.Map;

public interface IUserService {
    //login
    public User getUserBynameandpsw(String username, String password);
    //select all user by  somme key
    public List<User> getAllUserBykey(String key);
    //update user info.
    public int updateUser(User user);
    //delete a user
    public int delUserbyId(int id);

}
