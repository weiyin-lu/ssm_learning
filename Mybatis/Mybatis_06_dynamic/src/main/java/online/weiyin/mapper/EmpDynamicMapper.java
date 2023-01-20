package online.weiyin.mapper;

import online.weiyin.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpDynamicMapper {

    /**
     * 查询姓名、年龄、性别(根据内容多选)
     * @param emp
     * @return
     */
    List<Emp> getEmpDynamic(Emp emp);

    /**
     * 查询姓名、年龄、性别（三选一）
     * @param emp
     * @return
     */
    List<Emp> getEmpDynamicOnce(Emp emp);

    /**
     * 批量添加
     * @param emps
     * @return
     */
    Integer insertEmps(@Param("emps") List<Emp> emps);

    /**
     * 按照id批量删除
     * @param empIds
     * @return
     */
    Integer deleteEmpsById(@Param("empIds") Integer[] empIds);
}
