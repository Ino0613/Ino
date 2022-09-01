package cn.iyunmc.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler
    public Result doException(Exception e) {
        System.out.println(e);
        return new Result(666,null,"出异常啦！");
    }
}
