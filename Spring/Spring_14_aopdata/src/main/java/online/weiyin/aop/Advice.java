package online.weiyin.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class Advice {
//    各种通知获取参数的方法
    @Pointcut("execution(String online.weiyin.dao.*Dao.save (..))")
    public void point(){}

//    前置通知可以拿到参数列表
//    @Before("point()")
    public void before(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.print("前置通知");
        System.out.println(Arrays.toString(args));
    }

//    后置通知可以拿到参数列表
//    @After("point()")
    public void after(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.print("后置通知");
        System.out.println(Arrays.toString(args));

    }

//    环绕通知可以拿到参数列表、返回值、异常
//    @Around("point()")
    public Object around(ProceedingJoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.print("环绕通知（前）");
        System.out.println(Arrays.toString(args));

        args[0] = 666; //拦截参数并修改，除形参外，返回值也可以用同样的原理修改
        Object proceed = null;

        try { //捕获异常并进行修改或者处理
            proceed = joinPoint.proceed(args);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

        System.out.println("环绕通知（后）");
        return proceed;
    }

//    返回后通知可以拿到返回值
//    @AfterReturning(value = "point()",returning = "ret") //如果原始方法有返回值，就装到ret变量
    public void afterReturning(Object ret) {
        System.out.print("返回后通知");
        System.out.println(ret);
    }

//    异常后通知可以拿到异常
    @AfterThrowing(value = "point()",throwing = "t")
    public void afterThrowing(Throwable t) {
        System.out.print("异常后通知");
        System.out.println(t);
    }
}
