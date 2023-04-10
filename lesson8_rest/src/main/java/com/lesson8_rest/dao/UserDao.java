package com.lesson8_rest.dao;

import com.lesson8_rest.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface UserDao extends JpaRepository<User,Integer> {
    /**
     * 自定义接口查询方法，暴露为REST资源
     */
    @RestResource(path = "findByUname",rel = "findByUname")
    public List<User> findByUnameContaining(@Param("uname") String uname);
}
