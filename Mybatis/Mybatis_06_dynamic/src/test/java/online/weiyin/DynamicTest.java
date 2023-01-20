package online.weiyin;

import online.weiyin.mapper.EmpDynamicMapper;
import online.weiyin.pojo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class DynamicTest {
//    动态标签if 查询信息
    @Test
    public void testGetEmpDynamic() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
        SqlSession session = build.openSession();
        EmpDynamicMapper mapper = session.getMapper(EmpDynamicMapper.class);

        Emp emp = new Emp();
        emp.setEmpName("赵六");
        List<Emp> emps = mapper.getEmpDynamic(emp);
        System.out.println(emps);
    }
//    动态标签choose 查询信息
    @Test
    public void testGetEmpDynamicOnce() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
        SqlSession session = build.openSession();
        EmpDynamicMapper mapper = session.getMapper(EmpDynamicMapper.class);

        Emp emp = new Emp();
//        emp.setEmpName("张三");
        emp.setGender("女");
        List<Emp> emps = mapper.getEmpDynamicOnce(emp);
        System.out.println(emps);
    }
//    动态标签foreach 批量添加
    @Test
    public void testInsert() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
        SqlSession session = build.openSession();
        EmpDynamicMapper mapper = session.getMapper(EmpDynamicMapper.class);

        Emp emp = new Emp();
        emp.setEmpName("小明1");emp.setAge(23);emp.setGender("男");
        Emp emp2 = new Emp();
        emp2.setEmpName("小明2");emp2.setAge(23);emp2.setGender("男");
        Emp emp3 = new Emp();
        emp3.setEmpName("小明3");emp3.setAge(23);emp3.setGender("男");
        List<Emp> emps = Arrays.asList(emp, emp2, emp3);

        Integer integer = mapper.insertEmps(emps);
        session.commit();
        System.out.println(integer);
    }
//    批量删除
    @Test
    public void testDelete() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
        SqlSession session = build.openSession();
        EmpDynamicMapper mapper = session.getMapper(EmpDynamicMapper.class);

        Integer[] integers = {13,14};
        Integer integer = mapper.deleteEmpsById(integers);
        session.commit();
        System.out.println(integer);
    }
}
