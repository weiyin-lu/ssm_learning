package online.weiyin.service;

import online.weiyin.pojo.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    List<Student> selectAll();
}
