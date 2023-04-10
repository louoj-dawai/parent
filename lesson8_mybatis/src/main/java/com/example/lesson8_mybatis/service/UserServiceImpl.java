package com.example.lesson8_mybatis.service;

import com.example.lesson8_mybatis.bean.User;
import com.example.lesson8_mybatis.dao.AdminDao;
import com.example.lesson8_mybatis.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService{
    @Autowired
    private UserDao userDao;
    @Autowired
    private AdminDao adminDao;
    @Override
    public String findAll(Model model) {
//        List<User> users=userDao.findAll();
        List<User> users=adminDao.findAll();
        model.addAttribute("users",users);

        return "userShow";
    }
}
