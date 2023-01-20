package online.weiyin.mapper;

import online.weiyin.pojo.Dept;
import online.weiyin.pojo.Emp;
import online.weiyin.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class EmpMapperTest {

    Emp emp;
    {
        Dept dept = new Dept();
        dept.setDeptId(1);
        emp = new Emp();
        emp.setEmpName("测试人员");
        emp.setAge(18);
        emp.setGender("男");
        emp.setDept(dept);
    }

    @Test
    public void insert() {
        SqlSession session = SqlSessionUtil.getSession(true);
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        mapper.insert(emp);
    }

    @Test
    public void select() {
    }

    @Test
    public void selectEmpAndDept() {
        SqlSession session = SqlSessionUtil.getSession(true);
        EmpMapper mapper = session.getMapper(EmpMapper.class);
//        Emp emp1 = mapper.selectEmpAndDept(5);
        Emp emp1 = mapper.selectEmpAndDeptAnno(5);
        System.out.println(emp1);
    }
}