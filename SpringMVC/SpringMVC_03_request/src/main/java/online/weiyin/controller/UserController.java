package online.weiyin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user") //设置类访问前缀
public class UserController {

    @RequestMapping("/save") //两个相同路径的请求同时存在会产生异常
    @ResponseBody
    public String save() {
        System.out.println("UserController save run");
        return "{'ret':'UserController save run'}";
    }
}
