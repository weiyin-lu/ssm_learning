package online.weiyin.config;

import online.weiyin.pojo.Student;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@PropertySource("ssm.properties")
@MapperScan("online.weiyin.mapper") //mybatis-spring包提供的mapper扫描，<mapper>标签的功能
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
//        spring-jdbc提供的原生数据源
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(pwd);

        return dataSource;
    }
//    SqlSessionFactory工厂bean，使用mybatis-spring包提供的factorybean快速创建
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setTypeAliasesPackage("online.weiyin.pojo"); //设置<typeAlias>
        sqlSessionFactoryBean.setDataSource(dataSource);//使用注入的DataSource设置了<environment>
        return sqlSessionFactoryBean;
    }
////    映射扫描配置类。此bean等价于上方的@MapperScan一致
//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer() {
//        MapperScannerConfigurer configurer = new MapperScannerConfigurer();
//        configurer.setBasePackage("online.weiyin.mapper");
//        return configurer;
//    }

}
