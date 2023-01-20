package online.weiyin;

import online.weiyin.mapper.DeptMapper;
import online.weiyin.mapper.EmpMapper;
import online.weiyin.pojo.Dept;
import online.weiyin.pojo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ResultMapTest {
//    基本映射集测试
    @Test
    public void testgetEmpById() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
        SqlSession session = build.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        List<Emp> emps = mapper.selectEmpById(1);
        System.out.println(emps);
    }
//    多表查询（多对一）
    @Test
    public void testgetEmpAndDeptById() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
        SqlSession session = build.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emps = mapper.selectEmpAndDeptByEmpId(1);
        System.out.println(emps);
    }
//    分步查询（多对一）
    @Test
    public void testgetEmpAndDeptByStep() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
        SqlSession session = build.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emps = mapper.getEmpAndDeptToStepOne(2);
        System.out.println(emps.getEmpName()); //SQL懒加载，分步查询时没有被调用资源的步骤不会执行
        System.out.println(emps); //此处要获得整个emps对象的地址，所以分步查询此时被执行
    }
//    多表查询（一对多）
    @Test
    public void getDeptAndEmpById() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
        SqlSession session = build.openSession();
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmpByDeptId(1);
        System.out.println(dept);
    }
//    分步查询（一对多）
    @Test
    public void testgetDeptAndEmpByStep() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
        SqlSession session = build.openSession();
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmptoStepOne(1);
        System.out.println(dept);
    }
}
