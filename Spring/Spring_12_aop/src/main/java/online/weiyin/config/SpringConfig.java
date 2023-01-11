package online.weiyin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({"online.weiyin.dao","online.weiyin.aop"})
@EnableAspectJAutoProxy //声明aop注解开发
public class SpringConfig {
}
