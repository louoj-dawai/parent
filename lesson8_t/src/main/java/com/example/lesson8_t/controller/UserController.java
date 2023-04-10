package com.example.lesson8_t.controller;

import com.example.lesson8_t.bean.User;
import com.example.lesson8_t.service.UserService;
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

    @RequestMapping("deleteUserByUid")
    public String deleteUserByUid(int uid, Model model){
        System.out.println("执行了");
        return  userService.deleteUserByUid(uid,model);
    }
    @RequestMapping("login")
    public String login(User user, Model model){
        System.out.println(user.getUname());
        return userService.login(user,model);
    }
     //分页显示
    @RequestMapping("getUserPage")
    public String getUserPage(int currPage, Model model){
        return  userService.getUserPage(currPage,model);
    }

    //一对一 关联查询
    @RequestMapping("getUserCard")
    public String getUserCard(int uid, Model model){
        return  userService.getUserCard(uid,model);
    }
}
