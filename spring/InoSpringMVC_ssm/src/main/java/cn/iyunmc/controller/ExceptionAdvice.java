package cn.iyunmc.controller;

import cn.iyunmc.exception.BusinessException;
import cn.iyunmc.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(SystemException.class)
    public Result doSysotemException(SystemException e) {
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员，e对象发送给开发人员
        return new Result(e.getCode(), null, e.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessExcetpion(BusinessException e) {
        return new Result(e.getCode(), null, e.getMessage());
    }
    @ExceptionHandler(Exception.class)
    public Result doException(Exception e) {
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员，e对象发送给开发人员
        return new Result(Code.SYSTEM_UNKNOW_ERR,null,"出异常啦！");
    }
}
