package online.weiyin.mapper;

import online.weiyin.pojo.Emp;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper //声明mybatis代理bean
public interface EmpMapper {

    void insertAll(Emp emp);
    void update(Emp emp);
    void delete(Integer empId);
    Emp selectById(Integer empId);
    List<Emp> selectAll();
}
