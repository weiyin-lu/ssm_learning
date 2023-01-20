package online.weiyin.mapper;

import online.weiyin.pojo.Dept;
import org.apache.ibatis.annotations.Select;

public interface DeptMapper {

    @Select("select * from t_dept where dept_id=#{deptId}")
    Dept selectByDeptId(Integer deptId);
}
