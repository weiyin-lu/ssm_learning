package online.weiyin.controller;

import online.weiyin.pojo.Order;
import online.weiyin.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

//    JSON传递集合
    @RequestMapping("/get1")
    @ResponseBody
    public String get1(@RequestBody List<String> likes) { //从请求体里获取参数
        System.out.println("JSON集合传递" + likes);
        return "{'ret' : 'get1'}";
    }
//    JSON传递集合
    @RequestMapping("/get2")
    @ResponseBody
    public String get2(@RequestBody Order order) { //从请求体里获取参数
        System.out.println("JSON对象传递" + order);
        return "{'ret' : 'get2'}";
    }
//    JSON传递集合
    @RequestMapping("/get3")
    @ResponseBody
    public String get3(@RequestBody List<Order> order) { //从请求体里获取参数
        System.out.println("JSON对象集合传递" + order);
        return "{'ret' : 'get3'}";
    }



}
