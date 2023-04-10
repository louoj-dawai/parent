package com.example.lesson8_a.repository;


import com.example.lesson8_a.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    public List<User> findByUid(int uid);
    public List<User> findByUname(String uname);
    public List<User> findByUnameLike(String uname);
    public List<User> findByUnameContaining(String uname);
}
