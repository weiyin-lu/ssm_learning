package online.weiyin.controller;

import online.weiyin.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController //包括@Controller和@ResponseBody的所有功能
@RequestMapping("/users") //RESTful风格，起始路径用复数形式
public class UserController {

    @PostMapping("/add/") //使用更简洁的方式声明请求类型，前提是必须使用RestController注解
    public String add(@RequestBody User user) {
        System.out.println("添加" + user);
        return "add";
    }

    @GetMapping("/select/{i}")
    public String select(@PathVariable int i) {
        System.out.println("查询" + i);
        return "select";
    }


    @PutMapping("/update/")
    public String update(@RequestBody User user) {
        System.out.println("更新" + user);
        return "update";
    }

    @DeleteMapping("/delete/{i}")
    public String delete(@PathVariable int i) {
        System.out.println("删除" + i);
        return "delete";
    }

}
