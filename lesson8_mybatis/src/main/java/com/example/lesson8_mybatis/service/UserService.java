package com.example.lesson8_mybatis.service;

import com.example.lesson8_mybatis.bean.User;
import org.springframework.ui.Model;

import java.util.List;

public interface UserService {
    public String findAll(Model model);
}
