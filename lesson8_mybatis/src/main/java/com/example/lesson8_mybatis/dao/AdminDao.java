package com.example.lesson8_mybatis.dao;

import com.example.lesson8_mybatis.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminDao {
    public List<User> findAll();
}
