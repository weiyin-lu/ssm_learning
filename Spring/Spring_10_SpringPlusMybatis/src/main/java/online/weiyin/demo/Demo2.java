package online.weiyin.demo;

import online.weiyin.config.SpringConfig;
import online.weiyin.mapper.StudentMapper;
import online.weiyin.pojo.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
//        使用spring整合后的用法
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        StudentMapper bean = context.getBean(StudentMapper.class);
        List<Student> students = bean.selectAll();
        System.out.println(students);
    }
}
