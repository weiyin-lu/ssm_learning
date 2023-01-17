package online.weiyin.controller;

import online.weiyin.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("/book")
public class BookController {

    //    响应页面
    @RequestMapping("/page")
    public String page() {
        System.out.println("跳转页面");
        return "index.jsp";
    }

    //    响应字符串
    @RequestMapping("/text")
    @ResponseBody //把响应的字符串加在响应体里，才能不被当作页面返回
    public String text() {
        System.out.println("响应字符串");
        return "text";
    }

    //    响应JSON数据
    @RequestMapping("/json")
    @ResponseBody //此处同响应字符串，不加被默认成页面
    public User json() {
        System.out.println("响应JSON");
        User user = new User();
        user.setId("15KIA");
        user.setAge("18岁");
        return user; //自动转换使用的是jackson包实现 配置中的EnableWebMvc注解对其自动转换进行了配置
    }

    //    响应集合类型
    @RequestMapping("/jsonlist")
    @ResponseBody //此处同响应字符串，不加被默认成页面
    public List<User> jsonlist() {
        System.out.println("响应JSON");
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setId("15KIA");
        user.setAge("18岁");
        users.add(user);
        return users;
    }
}
