package com.example.lesson8_t;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.lesson8_t.repository")
@EntityScan(basePackages ="com.example.lesson8_t.bean")
public class Lesson8TApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lesson8TApplication.class, args);
    }

}
