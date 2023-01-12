package online.weiyin.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//更简单的servlet容器启动配置类
public class ServletInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

//    设置spring配置类
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }
//    设置springMVC配置类
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }
//    设置接管路径
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
