package online.weiyin.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

//更简单的servlet容器启动配置类
public class ServletInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

//    设置spring配置类
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
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
//    中文编码处理
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        return new Filter[]{filter};
    }
}
