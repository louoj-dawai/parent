package com.example.lesson8_t.service;

import com.example.lesson8_t.bean.User;
import com.example.lesson8_t.pojo.UserCard;
import org.springframework.data.domain.Page;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Map;

public interface UserService {


    public String findAll(Model model);
    public String findByUid(int uid,Model model);
    public String findByUname(String uname,Model model);
    public String findByUnameLike(String uname,Model model);
    public String findByUnameContaining(String uname,Model model);
    public String deleteUserByUid(int uid,Model model);

    public String login(User user,Model model);

    //分页查询
    public String  getUserPage(int currPage,Model model);

    //一对一关联查询
    public String getUserCard(int uid,Model model);

}
