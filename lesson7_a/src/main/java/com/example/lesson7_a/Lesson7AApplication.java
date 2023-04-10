package com.example.lesson7_a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
public class Lesson7AApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lesson7AApplication.class, args);
    }

}
