package online.weiyin.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect //定义为切面类
public class Advice {

//    定义切入点的位置，需要依赖一个无参无返回值无逻辑的类
    @Pointcut("execution( void online.weiyin.*.*Dao.update(..) )") //切入点表达式
    private void point(){}
//    另一个切入点
    @Pointcut("execution( int online.weiyin.*.*Dao.save(..) )")
    private void point2(){}

//    定义切面位置
    @Before("point()")
//    通知方法
    public void before() {
        System.out.println("前置通知");;
    }

    @After("point()")
    public void after() {
        System.out.println("后置通知");
    }

    @Around("point()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知（前）");
        pjp.proceed(); //对原始方法的调用，因为无法预期其方法是否有异常，所以必须抛出一个异常。如果不调用原始方法，就会跳过原始方法执行
        System.out.println("环绕通知（后）");
    }

//    对于有参数的方法进行切面编程，因为有代理对象产生，所以需要返回值给原始对象
    @Around("point2()")
    public Object saveAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知（前）");
        Object proceed = pjp.proceed();
        System.out.println("环绕通知（后）");
//        return 200; //代理对象直接返回意味着覆盖原对象值
        return proceed; //pjp对象的返回值是原始对象的值
    }

    /**
     * 执行流程
     * 1.spring容器启动
     * 2.读取所有切面配置的切入点，一个切入点被定义并且安排通知，才视作切面配置
     * 3.初始化bean，判断每个bean的方法是否匹配到任意切入点
     *   匹配失败创建对象
     *   匹配成功创建代理对象
     * 4.获取bean执行方法
     * 本质上aop使用代理模式实现
     */
    /**
     * 切入点表达式
     * execution([访问修饰符] 返回值 全限定类名.方法名 (参数) [异常名])
     * execution( public void online.weiyin.dao.BookDao.save (int) )
     * 切入点表达式通配符
     * * : 单个独立的任意符号
     * execution(public * online.weiyin.*.UserService.find* (*) )
     * online.weiyin包下任意包里的UserService类或接口中以find开头的方法，返回值任意，必须有一个参数
     * .. : 0个/多个连续的任意符号
     * execution(public User com..UserService.findById(..))
     * com包下任意包里的UserService类或接口中的findById方法，返回值User，参数列表任意
     * + : 匹配子类类型
     * execution(* *..*Service+.* (..))
     * 任意业务层接口
     * 返回值不限定，包不限定，类必须以Service结尾且匹配子类，方法不限定，参数列表不限定
     */
}
