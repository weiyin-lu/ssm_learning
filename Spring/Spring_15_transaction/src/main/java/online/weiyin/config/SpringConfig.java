package online.weiyin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("online.weiyin.service")
@Import({JdbcConfig.class, MybatisConfig.class})
@EnableTransactionManagement //启动注解式事务管理
public class SpringConfig {
}
