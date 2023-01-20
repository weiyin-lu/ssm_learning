package online.weiyin.mapper;

import online.weiyin.pojo.Dept;
import online.weiyin.pojo.Emp;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface EmpMapper {
//    注解主要用于替换映射文件，在mybatis使用注解的体验不算特别好。
    @Insert("insert into t_emp value (null,#{empName},#{age},#{gender},#{dept.deptId})")
    Integer insert(Emp emp);
    @Update("update t_emp set emp_name=#{empName},gender=#{gender}," +
            "age=#{age},dept_id=#{dept.deptId} where emp_id=#{empId}")
    Integer update(Emp emp);
    @Delete("delete from t_emp where emp_id=#{id}")
    Integer delete(Integer id);
    @Select("select * from t_emp")
    List<Emp> select();

//    注解多对一查询
//    1.级联方式
    @Select("select e.emp_id, e.emp_name, e.age, e.gender, d.dept_id, d.dept_name " +
            "from t_emp e join t_dept d on e.dept_id = d.dept_id where e.emp_id = #{empId}")
//    封装结果集
    @Results({
            @Result(column = "emp_id",property = "empId"),
            @Result(column = "emp_name",property = "empName"),
            @Result(column = "age",property = "age"),
            @Result(column = "gender",property = "gender"),
//            级联方式实现多对一
            @Result(column = "dept_id",property = "dept.deptId"),
            @Result(column = "dept_name",property = "dept.deptName")
    })
    Emp selectEmpAndDept(Integer empId);

//    2.使用@One实现分步查询
    @Select("select * from t_emp where emp_id=#{empId}")
    @Results({
            @Result(column = "emp_id",property = "empId"),
            @Result(column = "emp_name",property = "empName"),
            @Result(column = "age",property = "age"),
            @Result(column = "gender",property = "gender"),
            @Result(
                    property = "dept", //要封装的属性名称
                    javaType = Dept.class, //要封装的实体类型
                    column = "dept_id", //二次查询的依据
                    one = @One(select = "online.weiyin.mapper.DeptMapper.selectByDeptId", //子查询命令所在的位置，全限定类名
                            fetchType = FetchType.LAZY) //延迟加载选项
            )
    })
    Emp selectEmpAndDeptAnno(Integer empId);


}
