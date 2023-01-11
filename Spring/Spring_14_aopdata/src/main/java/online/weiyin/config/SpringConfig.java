package online.weiyin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({"online.weiyin.aop","online.weiyin.dao"})
@EnableAspectJAutoProxy
public class SpringConfig {
}
