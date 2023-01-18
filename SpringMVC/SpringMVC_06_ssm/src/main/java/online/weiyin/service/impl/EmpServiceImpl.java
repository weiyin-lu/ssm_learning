package online.weiyin.service.impl;

import online.weiyin.mapper.EmpMapper;
import online.weiyin.pojo.Emp;
import online.weiyin.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper; //因为mapper被mybatis装配了，IDEA默认检查有误，可能会报错

    @Override
    public void addEmp(Emp emp) {
        empMapper.insertAll(emp);
    }

    @Override
    public void updateEmp(Emp emp) {
        empMapper.update(emp);
    }

    @Override
    public void deleteById(Integer empId) {
        empMapper.delete(empId);
    }

    @Override
    public Emp getById(Integer empId) {
        return empMapper.selectById(empId);
    }

    @Override
    public List<Emp> getAll() {
        return empMapper.selectAll();
    }
}
