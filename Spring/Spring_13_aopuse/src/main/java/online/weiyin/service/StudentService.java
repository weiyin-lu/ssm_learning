package online.weiyin.service;

import online.weiyin.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> selectAll();
    Student selectByPrimaryKey(int id);

}
