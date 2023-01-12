package online.weiyin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("online.weiyin.controller")
public class SpringMvcConfig {
    /**
     * 1.定义controller，添加定义bean注解
     * 2.定义方法
     * 3.设置访问路径
     * 4.创建SpringMvnConfig配置类
     * 5.创建ServletInitConfig配置类
     */
}
