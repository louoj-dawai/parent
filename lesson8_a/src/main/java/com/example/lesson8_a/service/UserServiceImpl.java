package com.example.lesson8_a.service;

import com.example.lesson8_a.bean.User;
import com.example.lesson8_a.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public String findAll(Model model) {
        List<User> users=userRepository.findAll();
        model.addAttribute("users",users);
        return "userShow";
    }

    @Override
    public String findByUid(int uid, Model model) {
        List<User> users=userRepository.findByUid(uid);
        model.addAttribute("users",users);
        return "userShow";
    }

    @Override
    public String findByUname(String uname, Model model) {
        List<User> users=userRepository.findByUname(uname);
        model.addAttribute("users",users);
        return "userShow";
    }

    @Override
    public String findByUnameLike(String uname, Model model) {
        List<User> users=userRepository.findByUnameLike(uname);
        model.addAttribute("users",users);
        return "userShow";
    }

    @Override
    public String findByUnameContaining(String uname, Model model) {
        List<User> users=userRepository.findByUnameContaining(uname);
        model.addAttribute("users",users);
        return "userShow";
    }
}
