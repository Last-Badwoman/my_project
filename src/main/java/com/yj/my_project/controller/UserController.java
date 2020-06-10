package com.yj.my_project.controller;

import com.yj.my_project.entity.User;
import com.yj.my_project.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Api(tags = "查询用户相关信息")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/queryAllInfo")
    @ApiOperation(value = "获取全部用户信息")
    public List<User> queryAllInfo() {
      List<User>  users =  userService.queryAllUserInfo();
        return users;
    }

    @GetMapping("/queryInfoById/{id}")
    @ApiOperation(value = "根据id获取用户信息",notes = "参数为必填")
    public User queryInfoById(@ApiParam(value ="用户id",required = true) @PathVariable("id")Integer id) {
        User user =  userService.queryUserInfoById(id);
        return user == null?null : user;
    }

    @PostMapping("/insertUser")
    @ApiOperation(value = "添加用户信息")
    public String insertUser(@ApiParam(value = "用户信息") @RequestBody User user) {
        try {
            userService.insert(user);
            return "添加成功";
        }catch (Exception e) {
            return "添加失败";
        }
    }

    @DeleteMapping("/deleteUserById/{id}")
    @ApiOperation(value = "根据用户id删除用户信息")
    public String deletUserById(@ApiParam(value = "用户id",required = true) @PathVariable("id") Integer id) {
        try {
            userService.deleteUserById(id);
            return "删除成功";
        }catch (Exception e) {
            return "删除失败";
        }
    }

    @PutMapping("/updateUserInfoById")
    @ApiOperation(value = "根据用户id修改用户信息")
    public String updateUserInfoById(@ApiParam(value = "用户信息") @RequestBody User user) {
        try {
            userService.updateUserInfoById(user);
            return "修改成功";
        }catch (Exception e) {
            return "修改失败";
        }
    }
}
