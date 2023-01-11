package online.weiyin.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@PropertySource("ssm.properties")
public class JdbcConfig {

//    对自定义第三方bean的普通类型注入
    @Value("${mysql.driver}")
    private String driver;
    @Value("${mysql.url}")
    private String url;
    @Value("${mysql.username}")
    private String user;
    @Value("${mysql.password}")
    private String pwd;

    @Bean //第三方/自定义bean的注解
    public DataSource dataSource() { //在方法的参数列表中提供引用类型注入
//        spring-jdbc提供的原生数据源
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(pwd);

        return dataSource;
    }
}
