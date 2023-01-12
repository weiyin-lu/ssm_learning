package online.weiyin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
//@ComponentScan({"online.weiyin.service","online.weiyin.dao"}) //使用更精准的包扫描解决bean重叠加载的问题
@ComponentScan(value = "online.weiyin", //使用排除的方法解决bean重叠加载的问题
    excludeFilters = @ComponentScan.Filter( //bean扫描过滤器
            type = FilterType.ANNOTATION, //按注解排除
            classes = Controller.class //排除所有Controller注解
    )
)
public class SpringConfig {
}
