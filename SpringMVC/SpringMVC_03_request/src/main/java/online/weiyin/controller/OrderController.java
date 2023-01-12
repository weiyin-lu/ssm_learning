package online.weiyin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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



}
