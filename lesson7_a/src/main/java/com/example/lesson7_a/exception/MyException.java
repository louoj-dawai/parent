package com.example.lesson7_a.exception;

public class MyException extends  Exception{
    //serialVersionUID 用来表明实现序列化类的不同版本间的兼容性
    private static  final long serialVersionUID=1L;
    public MyException() {
        super();
    }
    public MyException(String message) {
        super(message);
    }

}
