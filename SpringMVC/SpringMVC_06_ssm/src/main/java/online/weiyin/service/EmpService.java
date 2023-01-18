package online.weiyin.service;

import online.weiyin.pojo.Emp;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional //该类所有方法被spring事务接管
public interface EmpService {
    /**
     * 添加一条
     * @param emp
     */
    void addEmp(Emp emp);

    /**
     * 更新一条
     * @param emp
     */
    void updateEmp(Emp emp);

    /**
     * 按id删除一条
     * @param empId
     */
    void deleteById(Integer empId);

    /**
     * 按id查询
     * @param empId
     * @return
     */
    Emp getById(Integer empId);

    /**
     * 查询所有
     * @return
     */
    List<Emp> getAll();
}
