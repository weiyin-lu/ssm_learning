package online.weiyin.mapper;

import online.weiyin.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    User selectById(Integer id);

    /**
     * 根据name和password查询用户信息
     * @param name
     * @param pwd
     * @return
     */
//    多参数传递本质上是使用map传递，当具有多个值时，mybatis默认以arg0、arg1...作为键，或者以param1、param2...为键
//    使用@Param()可以自定义键名并使用
    List<User> selectByAuthorize(@Param("name") String name,@Param("pwd") String pwd);

    /**
     * 添加一个新用户
     * @param user
     * @return
     */
//    传递对象参数时自动以属性名为键
    Integer insertUser(User user);
}
