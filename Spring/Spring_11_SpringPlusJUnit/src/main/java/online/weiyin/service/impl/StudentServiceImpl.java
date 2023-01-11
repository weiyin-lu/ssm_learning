package online.weiyin.service.impl;

import online.weiyin.mapper.StudentMapper;
import online.weiyin.pojo.Student;
import online.weiyin.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }
}
