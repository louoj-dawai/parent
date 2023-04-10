package com.example.lesson8_t.service;

import com.example.lesson8_t.bean.User;
import com.example.lesson8_t.pojo.UserCard;
import com.example.lesson8_t.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public String findAll(Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "userShow";
    }

    @Override
    public String findByUid(int uid, Model model) {
        List<User> users = userRepository.findByUid(uid);
        model.addAttribute("users", users);
        return "userShow";
    }

    @Override
    public String findByUname(String uname, Model model) {
        List<User> users = userRepository.findByUname(uname);
        model.addAttribute("users", users);
        return "userShow";
    }

    @Override
    public String findByUnameLike(String uname, Model model) {
        List<User> users = userRepository.findByUnameLike(uname);
        model.addAttribute("users", users);
        return "userShow";
    }

    @Override
    public String findByUnameContaining(String uname, Model model) {
        List<User> users = userRepository.findByUnameContaining(uname);
        model.addAttribute("users", users);
        return "userShow";
    }

    @Override
    public String deleteUserByUid(int uid, Model model) {
        int res=userRepository.deleteUserByUid(uid);
        String mess=null;
        if(res>0){
            mess="succ";
        }else{
            mess="error";
        }
        model.addAttribute("mess",mess);
        return "forward:/";
    }

    @Override
    public String login(User user, Model model) {
        User u1=userRepository.login(user.getUname(),user.getUpass());

        System.out.println(u1.getUname());
        return "succ";
    }

    @Override
    public String getUserPage(int currPage, Model model) {
        int pageSize=4;
        Page<User> pageDate=userRepository.findAll(PageRequest.of(currPage-1,pageSize, Sort.by(Sort.Direction.DESC,"uid")));
        List<User> users=pageDate.getContent();
        model.addAttribute("users",users);
        //获得总记录数
        model.addAttribute("totalCount",pageDate.getTotalElements());
        //获得总页数
        model.addAttribute("totalPage",pageDate.getTotalPages());
        model.addAttribute("currPage",currPage);
        return "userShow";
    }
    //一对一的关联查询
    @Override
    public String getUserCard(int uid, Model model) {
        List<UserCard> userCards=userRepository.getUserCard(uid);
        model.addAttribute("userCards",userCards);
        return "userCard";
    }
}
