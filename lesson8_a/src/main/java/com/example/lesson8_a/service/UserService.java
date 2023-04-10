package com.example.lesson8_a.service;

import com.example.lesson8_a.bean.User;
import org.springframework.ui.Model;

import java.util.List;

public interface UserService {


    public String findAll(Model model);
    public String findByUid(int uid,Model model);
    public String findByUname(String uname,Model model);
    public String findByUnameLike(String uname,Model model);
    public String findByUnameContaining(String uname,Model model);

}
