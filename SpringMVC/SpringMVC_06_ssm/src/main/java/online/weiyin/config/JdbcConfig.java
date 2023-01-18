package online.weiyin.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@PropertySource("ssm.properties")
public class JdbcConfig {

    @Value("{mysql.driver}")
    private String driver;
    @Value("{mysql.url}")
    private String url;
    @Value("{mysql.username}")
    private String user;
    @Value("{mysql.password}")
    private String pwd;

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(pwd);
        return dataSource;
    }
}
