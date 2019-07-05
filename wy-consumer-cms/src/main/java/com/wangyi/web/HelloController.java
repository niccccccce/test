package com.wangyi.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/toUserList")
    public String toUserList(){

        return "admin/teacherList";
    }
    @RequestMapping("/toAddUser")
    public String toAddUser(){
        return "admin/addTeacher";
    }
}
