package online.weiyin.mapper;

import online.weiyin.pojo.Clazz;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClazzMapper {
    /**
     * 插入一条记录，并返回插入的主键到clazz对象里
     * @param clazz
     * @return
     */
    int insertClass(Clazz clazz);

    /**
     * 模糊查询
     * @param name
     * @return
     */
    List<Clazz> selectByClassName(@Param("name") String name);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    Integer deleteBatchById(@Param("ids") String ids);

}
