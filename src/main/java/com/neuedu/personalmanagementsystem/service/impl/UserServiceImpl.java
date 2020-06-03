package com.neuedu.personalmanagementsystem.service.impl;

import com.neuedu.personalmanagementsystem.entity.User;
import com.neuedu.personalmanagementsystem.mapper.UserMapper;
import com.neuedu.personalmanagementsystem.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
   // @Resource
   @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserBynameandpsw(String username, String password) {
        System.out.println("222"+userMapper);
        return userMapper.getUserBynameandpsw(username,password);
    }

    @Override
    public List<User> getAllUserBykey(String key) {
        return null;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int delUserbyId(int id) {
        return 0;
    }
}
