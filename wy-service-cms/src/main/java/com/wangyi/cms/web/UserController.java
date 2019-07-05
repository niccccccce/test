package com.wangyi.cms.web;

import com.wangyi.cms.service.UserService;
import com.wangyi.controller.UserControllerApi;
import com.wangyi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserController implements UserControllerApi {

    @Autowired
    private UserService userService;
    @Override
    public List<User> userList(User user) {
        return userService.userList(user);
    }
}
