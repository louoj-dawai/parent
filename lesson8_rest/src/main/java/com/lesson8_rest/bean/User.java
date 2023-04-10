package com.lesson8_rest.bean;
import jakarta.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "user_table")
public class User implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;
    private String uname;
    private String upass;
    private String sex;
    private int age;
    public User() {
    }

    public User(int uid, String uname, String upass, String sex, int age) {
        this.uid = uid;
        this.uname = uname;
        this.upass = upass;
        this.sex = sex;
        this.age = age;

    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

