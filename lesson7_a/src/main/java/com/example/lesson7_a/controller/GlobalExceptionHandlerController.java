package com.example.lesson7_a.controller;

import com.example.lesson7_a.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.SQLException;

@ControllerAdvice
public class GlobalExceptionHandlerController {
    @ExceptionHandler(value = Exception.class)
    public String handlerException(Exception e) {
        //数据库异常
        if (e instanceof SQLException) {
            return "user/sqlError";
        } else if (e instanceof MyException) {//自定义异常
            return "user/myError";
        } else {//未知异常
            return "user/othereError";
        }
    }
}
