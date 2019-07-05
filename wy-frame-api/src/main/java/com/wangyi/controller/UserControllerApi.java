package com.wangyi.controller;

import com.wangyi.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface UserControllerApi {
    @RequestMapping("/userList")
    public List<User> userList(@RequestBody User user);
}
