import online.weiyin.mapper.EmpMapper;
import online.weiyin.pojo.Emp;
import online.weiyin.pojo.EmpExample;
import online.weiyin.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MbgTest {
    @Test
    public void mbgTest() {
        /**
         * mysql逆向工程只能实现单表查询，多表查询仍然要自己写
         */
        SqlSession session = SqlSessionUtil.getSession(true);
        EmpMapper mapper = session.getMapper(EmpMapper.class);
//        根据主键查询数据
//        Emp emp = mapper.selectByPrimaryKey(1);
//        System.out.println(emp);

//        查询所有数据
//        List<Emp> empList = mapper.selectByExample(null);
//        empList.forEach(System.out::println);

//        按条件查询，逆向工程使用QBC风格
        EmpExample empExample = new EmpExample();
        empExample.createCriteria().andEmpNameLike("%小明%");
        empExample.or().andGenderEqualTo("女");
        List<Emp> empList = mapper.selectByExample(empExample);
        empList.forEach(System.out::println);

//        修改
//        Emp emp = new Emp();
//        emp.setEmpId(1);
//        emp.setEmpName("admin");
//        emp.setAge(30);
//        emp.setGender("女");
//        普通修改，覆盖性修改所有字段
//        int i = mapper.updateByPrimaryKey(emp);
//        Selective选择性修改，如果对象里有为null的属性，不会覆盖原有的值
//        int i = mapper.updateByPrimaryKeySelective(emp);
//        System.out.println(i);
    }
}
