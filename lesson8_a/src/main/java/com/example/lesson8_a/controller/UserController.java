package com.example.lesson8_a.controller;

import com.example.lesson8_a.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/")
    public String findAll(Model model) {
        return  userService.findAll(model);
    }
    @RequestMapping("findByUid")
    public String findByUid(int uid,Model model) {
        return  userService.findByUid(uid,model);
    }
    @RequestMapping("findByUname")
    public String findByUname(String uname,Model model) {
        return  userService.findByUname(uname,model);
    }
    @RequestMapping("findByUnameLike")
    public String findByUnameLike(String uname,Model model) {
        return userService.findByUnameLike(uname,model);
    }

    @RequestMapping("findByUnameContaining")
    public String findByUnameContaining(String uname, Model model) {
        return userService.findByUnameContaining(uname,model);
    }



}
