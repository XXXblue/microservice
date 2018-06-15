package com.itmuch.cloud.microservicesimpleprovideruser.controller;

import com.itmuch.cloud.microservicesimpleprovideruser.dao.UserMapper;
import com.itmuch.cloud.microservicesimpleprovideruser.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: XBlue
 * @Date: Create in 2018/6/139:24
 * @Description:
 * @Modified By:
 */
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id){
        return userMapper.selectByPrimaryKey(id);
    }
}
