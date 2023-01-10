package online.weiyin.dao.impl;

import online.weiyin.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("bookDao") //自动bean创建注解，可以设置bean名
@Repository("bookDao") //衍生注解，用法和Component完全一致
//@Scope("propertype") //单例模式设置
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("BookDao run");
    }

    @PostConstruct //创建生命周期
    public void init() {
        System.out.println("BookDao init");
    }

    @PreDestroy //销毁生命周期
    public void destroy() {
        System.out.println("BookDao destroy");
    }
}
