package cc.yunmc.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.test.context.transaction.AfterTransaction;

import javax.annotation.PostConstruct;

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(void cc.yunmc.dao.BookDao.update())")
    private void pt() {

    }

    @Pointcut("execution(void cc.yunmc.dao.BookDao.wait())")
    private void pt2() {
    }

    @Before("pt()")
    public void method() {
        System.out.println(System.currentTimeMillis());
    }

    @After("pt()")
    public void after() {
        System.out.println("after advice ...");
    }

    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice ...");
        Object proceed = pjp.proceed();
        System.out.println("around after advice ...");
        return proceed;
    }

    @AfterReturning("pt()")
    public void afterReturning() {
        System.out.println("after returning advice ...");
    }

    @AfterThrowing("pt()")
    public void afterThrowing() {
        System.out.println("after Throwing advice ...");
    }
}
