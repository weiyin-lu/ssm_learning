package online.weiyin.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Advice {
//    定义切入点 service包内所有业务层的任意方法
    @Pointcut("execution(* online.weiyin.service.*Service.* (..) )")
    public void point(){}

//    定义通知，测试万次执行效率
    @Around("point()")
    public void runSpeed(ProceedingJoinPoint pjp) throws Throwable {
//        执行时原始对象的签名信息
        Signature signature = pjp.getSignature();
        String name = signature.getName();

        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 1000 ; i ++) {
            pjp.proceed();
        }
        long end = System.currentTimeMillis();

        System.out.print(name);
        System.out.print("千次执行效率：");
        System.out.println((end - start) + "ms");
    }
}
