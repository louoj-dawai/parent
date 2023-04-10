package com.example.lesson7_a.bean;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public class User {

    private int uid;
  @NotBlank(message = "{uname.required}")
//   @NotBlank(message = "用户名不能为空！")
   private String uname;
   @Length(min=6,max=12,message = "密码长度为6--12位！")
   private String upass;
    private String sex;
    private int age;
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
