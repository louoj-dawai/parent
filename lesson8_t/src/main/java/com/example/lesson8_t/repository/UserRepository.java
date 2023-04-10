package com.example.lesson8_t.repository;

import com.example.lesson8_t.bean.Card;
import com.example.lesson8_t.bean.User;
import com.example.lesson8_t.pojo.UserCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

public interface UserRepository extends JpaRepository<User,Integer> {
    public List<User> findByUid(int uid);
    public List<User> findByUname(String uname);
    public List<User> findByUnameLike(String uname);
    public List<User> findByUnameContaining(String uname);

    @Query("select u from User u where u.uname=?1 and u.upass=?2")
    public User login(String uname, String upass);
    @Transactional
    @Modifying
    @Query("delete from User u where u.uid=?1")
    public int deleteUserByUid(int uid);
//    一对一关联查询
    @Query("select new com.example.lesson8_t.pojo.UserCard(u.uid,u.uname,c.cid,c.money) from User u,Card c where u.uid=c.uid and u.uid=?1")
    public List<UserCard> getUserCard(int uid);



}
