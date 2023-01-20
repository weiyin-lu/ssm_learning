package online.weiyin.mapper;

import online.weiyin.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    /**
     * 查询员工（结果集用法）
     * @param id
     * @return
     */
    List<Emp> selectEmpById(@Param("empId") Integer id);

    /**
     * 查询员工及其部门（多对一）
     * @param id
     * @return
     */
    Emp selectEmpAndDeptByEmpId(@Param("empId") Integer id);

    /**
     * 查询员工及其部门 step 1（多对一）
     * @param id
     * @return
     */
    Emp getEmpAndDeptToStepOne(@Param("empId") Integer id);

    /**
     * 查询部门及部门员工信息 step 2（一对多）
     * @param id
     * @return
     */
    List<Emp> getDeptAndEmpToStepTwo(@Param("deptId") Integer id);
}
