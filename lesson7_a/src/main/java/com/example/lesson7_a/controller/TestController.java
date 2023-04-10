package com.example.lesson7_a.controller;

import com.example.lesson7_a.bean.User;
import com.example.lesson7_a.exception.MyException;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class TestController {
    @RequestMapping("/")
    public String getIndex(Model model, HttpSession session){

        model.addAttribute("pic","41-L4n70mfL._AC_UY218_.jpg");
        session.setAttribute("address","大连外国语大学");
        User user=new User();
        user.setUname("李四");
        user.setUpass("111111");
        user.setRole("teacher");
        model.addAttribute("user",user);
        List<User> userList=new ArrayList<>();
        User user1=new User();
        user1.setUname("张三");
        user1.setUpass("111111");
        user1.setRole("teacher");
        User user2=new User();
        user2.setUname("赵六");
        user2.setUpass("111111");
        user2.setRole("teacher");
        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        model.addAttribute("userList",userList);
         model.addAttribute("nowTime",new Date());
        return "index";
    }

    @RequestMapping("getTest")
    public String getTest(){
        return "test";
    }
    @RequestMapping("getLogin")
    public String getLogin(@ModelAttribute User user){
//        user.setUname("张三");
//        user.setUpass("123456");
        return "user/login";
    }
    @RequestMapping("login")
    public String login(@ModelAttribute @Validated User user, BindingResult res){
        if( res.hasErrors()){
            System.out.println("有错误！");
           return "user/login";
        }
        System.out.println(user.getUname());
        return "user/main";
    }
    @RequestMapping("i18n")
    public String i18n(){
       return "forward:getLogin";
    }

    @RequestMapping("dbError")
    public String dbError() throws  SQLException{
        throw new SQLException();
    }

    @RequestMapping("myError")
    public String myError() throws  MyException{
        throw new MyException();
    }

    @RequestMapping("othereError")
    public String othereError() throws  Exception{
        throw new Exception();
    }

    @ExceptionHandler(value=Exception.class)
    public String handlerException(Exception e) {
        //数据库异常
        if (e instanceof SQLException) {
            return "user/sqlError";
        } else if (e instanceof MyException) {//自定义异常
            return "user/myError";
        } else {//未知异常
            return "user/othereError";
        }
    }



}
