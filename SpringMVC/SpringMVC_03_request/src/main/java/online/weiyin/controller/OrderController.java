package online.weiyin.controller;

import online.weiyin.pojo.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {
//    请求参数传递

//    get 普通参数
    @RequestMapping("/get1")
    @ResponseBody
    public String get1(String name,int age) {
        System.out.println("get普通参数传递" + name + age);
        return "{'ret' : 'get1'}";
    }

//    post 普通参数
    @RequestMapping("/post1")
    @ResponseBody
    public String post1(String name,int age) {
        System.out.println("post普通参数传递" + name + age);
        return "{'ret' : 'post1'}";
    }

//    get 普通参数 键映射
    @RequestMapping("/get2")
    @ResponseBody
    public String get2(@RequestParam("username") String name, int age) {
        System.out.println("get普通参数传递(绑定)" + name + age);
        return "{'ret' : 'get2'}";
    }

//    get POJO参数
    @RequestMapping("/get3")
    @ResponseBody
    public String get3(Order order) {
        System.out.println("get对象参数传递" + order);
        return "{'ret' : 'get3'}";
    }

//    get POJO参数 嵌套
    @RequestMapping("/get4")
    @ResponseBody
    public String get4(Order order) {
        System.out.println("get对象参数传递（嵌套）" + order);
        return "{'ret' : 'get4'}";
    }

//    get 数组参数
    @RequestMapping("/get5")
    @ResponseBody
    public String get5(String[] likes) {
        System.out.println("get数组参数传递" + Arrays.toString(likes));
        return "{'ret' : 'get5'}";
    }

//    get 集合参数
    @RequestMapping("/get6")
    @ResponseBody
    public String get6(@RequestParam List<String> likes) { //从请求参数列表获得数据
        System.out.println("get集合参数传递" + likes);
        return "{'ret' : 'get6'}";
    }
}
