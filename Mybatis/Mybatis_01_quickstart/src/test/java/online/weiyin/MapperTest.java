package online.weiyin;

import online.weiyin.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MapperTest {
    @Test
    public void run() throws IOException {
//        1.把配置文件读取到数据流
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
//        2.把流传递给建造器创建SQL会话工厂
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
//        3.从工厂获得会话对象
        SqlSession session = build.openSession();
//        SqlSession sqlSession = build.openSession(true);//自动提交事务
//        4.从会话对象获得接口的代理对象
        UserMapper mapper = session.getMapper(UserMapper.class);
//        5.执行方法（命令）
        mapper.insertUser();
//        6.提交事务
        session.commit();
//        7.执行完成关闭会话
        session.close();
    }
}
