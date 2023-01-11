package online.weiyin.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@PropertySource("ssm.properties")
@MapperScan("online.weiyin.mapper")
public class MybatisConfig {
    @Value("${mysql.driver}")
    private String driver;
    @Value("${mysql.url}")
    private String url;
    @Value("${mysql.username}")
    private String user;
    @Value("${mysql.password}")
    private String pwd;

//    数据源bean
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(pwd);

        return dataSource;
    }
//    会话工厂bean
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setTypeAliasesPackage("online.weiyin.pojo"); //设置<typeAlias>
        sqlSessionFactoryBean.setDataSource(dataSource);//使用注入的DataSource设置了<environment>

        return sqlSessionFactoryBean;
    }

}
