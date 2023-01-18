package online.weiyin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("online.weiyin.controller")
@EnableWebMvc
@EnableTransactionManagement //启用注解事务管理
public class SpringMvcConfig {
}
