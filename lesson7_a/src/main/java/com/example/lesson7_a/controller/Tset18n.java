package com.example.lesson7_a.controller;

import java.util.Locale;
import java.util.ResourceBundle;

public class Tset18n {

    public static void main(String[] args) {
//        Locale lc = Locale.getDefault();
        Locale lc=new Locale("en","US");
        //根据国家语言环境加载资源文件
        ResourceBundle rb = ResourceBundle.getBundle("i18n/message", lc);
        //打印出从资源文件中取得的信息
        System.out.println(rb.getString("hello"));

    }
}
