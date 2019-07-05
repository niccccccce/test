package com.wangyi.web;

import com.wangyi.model.User;
import com.wangyi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userList")
    public List<User> userList(User user){
        List list=userService.userList(user);
        System.out.println(list);
        return list;
    }
}
