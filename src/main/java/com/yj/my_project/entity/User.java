package com.yj.my_project.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "用户实体")
public class User {

    @ApiModelProperty(name = "id",value = "用户id")
    private Integer id;
    @ApiModelProperty(name = "name",value = "用户名")
    private String name;
    @ApiModelProperty(name = "age",value = "用户年龄")
    private Integer age;

    public static List<User> getUser() {
        ArrayList<User> users = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            users.add(new User(i, "测试" + i, i));
        }
        return users;
    }
}
