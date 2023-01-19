package online.weiyin;

import online.weiyin.mapper.UserMapper;
import online.weiyin.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MapperTest {
    @Test
    public void run() throws IOException {
//        1.把配置文件读取到数据流
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
//        2.把流传递给建造器创建SQL会话工厂
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
//        3.从工厂获得会话对象
        SqlSession session = build.openSession(true);//自动提交事务
//        4.从会话对象获得接口的代理对象
        UserMapper mapper = session.getMapper(UserMapper.class);
//        5.执行方法（命令）
        User user = mapper.selectById(3);
        System.out.println(user);
//        6.提交事务
        session.commit();
//        7.执行完成关闭会话
        session.close();
    }

    @Test
    public void run2() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
        SqlSession session = build.openSession(true);//自动提交事务
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.selectByAuthorize("admin","admin");
        System.out.println(users);
        session.commit();
        session.close();
    }

    @Test
    public void run3() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
        SqlSession session = build.openSession(true);//自动提交事务
        UserMapper mapper = session.getMapper(UserMapper.class);

        User user = new User();
        user.setUsername("xiaoming");
        user.setPassword("123456");
        user.setAge(20);
        user.setGender("女");
        user.setEmail("xiaoming@admin.com");

        mapper.insertUser(user);

        session.commit();
        session.close();
    }
}
