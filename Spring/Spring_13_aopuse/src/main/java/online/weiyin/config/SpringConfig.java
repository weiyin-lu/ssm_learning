package online.weiyin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@Import({MybatisConfig.class})
@ComponentScan({"online.weiyin.service","online.weiyin.aop"})
@EnableAspectJAutoProxy
public class SpringConfig {
}
