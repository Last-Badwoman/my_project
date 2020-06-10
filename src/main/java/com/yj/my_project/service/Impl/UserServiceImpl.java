package com.yj.my_project.service.Impl;

import com.yj.my_project.entity.User;
import com.yj.my_project.mapper.UserMapper;
import com.yj.my_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryAllUserInfo() {
        List<User> users = userMapper.queryAllUserInfo();
        return users;
    }

    @Override
    public User queryUserInfoById(Integer id) {
        User user =  userMapper.queryUserInfoById(id);
        return user;
    }

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        userMapper.deleteUserById(id);
    }

    @Override
    public void updateUserInfoById(User user) {
        userMapper.updateUserInfoById(user);
    }
}
