package co.yunmc.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProjectAdvice {

    //@Pointcut("execution(* co.yunmc.spring.service.*Service.*(..))")
    private void servicePt() {

    }

    //@Around("ProjectAdvice.servicePt()")
    public void runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        String declaringTypeName = pjp.getSignature().getDeclaringTypeName();
        String name = pjp.getSignature().getName();
        for (int i = 0; i < 10000; i++) {
            pjp.proceed();
        }
        long end = System.currentTimeMillis();
        System.out.println("业务层" + declaringTypeName + "." + name + "万次执行时间" + (end - start));
    }

    @Pointcut("execution(boolean co.yunmc.spring.service.ResourcesService.*(..))")
    private void servicePt1(){}

    @Around("ProjectAdvice.servicePt1()")
    public Object trimStr(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        for (int i = 0; i < args.length; i++) {
            args[i] = args[i].toString().trim();
        }
        Object proceed = pjp.proceed(args);
        return proceed;
    }
}
