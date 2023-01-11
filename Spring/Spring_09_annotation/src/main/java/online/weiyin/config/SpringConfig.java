package online.weiyin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//纯注解开发，用类代替配置文件
@Configuration //定义此类是spring配置类
@ComponentScan({"online.weiyin.dao","online.weiyin.service"}) //组件扫描，多个包用数组写入，代替了配置文件中的<context:componentScan>
@Import({JdbcConfig.class}) //导入其他配置类，等于把配置文件合并到一起
public class SpringConfig {
}
