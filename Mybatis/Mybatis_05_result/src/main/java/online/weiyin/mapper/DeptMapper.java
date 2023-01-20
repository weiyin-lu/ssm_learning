package online.weiyin.mapper;

import online.weiyin.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    /**
     * 查询员工及其部门 step 2（多对一）
     * @param deptId
     * @return
     */
    Dept getEmpAndDeptToStepTwo(@Param("deptId") Integer deptId);

    /**
     * 查询部门及部门中员工的名单（一对多）
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);

    /**
     * 查询部门及部门内员工信息 step 1(一对多)
     * @param deptId
     * @return
     */
    Dept getDeptAndEmptoStepOne(@Param("deptId") Integer deptId);
}
