package online.weiyin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("online.weiyin.service")
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringConfig {
}
