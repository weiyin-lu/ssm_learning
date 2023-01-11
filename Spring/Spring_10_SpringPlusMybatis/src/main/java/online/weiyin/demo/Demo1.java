package online.weiyin.demo;

import online.weiyin.mapper.StudentMapper;
import online.weiyin.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) throws IOException {
//        常规的mybatis使用方法
        InputStream stream = Resources.getResourceAsStream("mybatis-config.bak");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream); //整合spring的核心对象，工厂

        SqlSession session = build.openSession(); //第二阶段的核心，会话对象
        StudentMapper mapper = session.getMapper(StudentMapper.class);

        List<Student> students = mapper.selectAll();
        System.out.println(students);
        session.close();
    }
}
