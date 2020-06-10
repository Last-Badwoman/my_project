package com.yj.my_project.service;

import com.yj.my_project.entity.User;

import java.util.List;

public interface UserService {

    /*
    * 查询全部用户信息
    * */
    List<User> queryAllUserInfo();

    /*
    * 根据用户id查询用户信息
    * */
    User queryUserInfoById(Integer id);

    /*
    * 添加用户信息
    * */
    void insert(User user);


    /*
    * 删除用户信息
    * */
    void deleteUserById(Integer id);


    /*
    * 修改用户信息
    * */
    void updateUserInfoById(User user);
}
