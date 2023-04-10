package com.example.lesson8_mybatis.controller;

import com.example.lesson8_mybatis.bean.User;
import com.example.lesson8_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/")
    public String findAll(User user, Model model) {
              return userService.findAll(model);
    }
}
