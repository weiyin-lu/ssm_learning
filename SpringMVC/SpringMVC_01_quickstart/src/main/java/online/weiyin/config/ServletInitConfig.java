package online.weiyin.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

//servlet容器启动配置类
public class ServletInitConfig extends AbstractDispatcherServletInitializer {
//    加载springMVC容器配置
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext context =
                new AnnotationConfigWebApplicationContext();
        context.register(SpringMvcConfig.class); //注册配置类
        return context;
    }
//    设置哪些请求归springMVC管
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"}; //根目录表示所有请求
    }
//    加载spring容器配置
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
