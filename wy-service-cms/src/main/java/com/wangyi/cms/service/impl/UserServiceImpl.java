package com.wangyi.cms.service.impl;

import com.wangyi.cms.dao.UserMapper;
import com.wangyi.cms.service.UserService;
import com.wangyi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> userList(User user) {
        return userMapper.userList(user);
    }
}
