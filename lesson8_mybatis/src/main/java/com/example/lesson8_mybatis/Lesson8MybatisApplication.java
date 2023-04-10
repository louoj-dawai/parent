package com.example.lesson8_mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.lesson8_mybatis.dao"})
public class Lesson8MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lesson8MybatisApplication.class, args);
    }

}
