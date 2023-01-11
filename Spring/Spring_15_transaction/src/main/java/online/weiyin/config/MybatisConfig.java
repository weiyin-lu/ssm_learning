package online.weiyin.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@MapperScan("online.weiyin.mapper")
public class MybatisConfig {

    @Bean
    public SqlSessionFactoryBean sessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setTypeAliasesPackage("online.weiyin.pojo");
        return factoryBean;
    }
}
