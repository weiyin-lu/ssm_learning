package online.weiyin.controller;

import online.weiyin.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books") //RESTful风格，起始路径用复数形式
@ResponseBody //代表类中所有方法的响应都返回到响应体里
public class BookController {

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(@RequestBody User user) {
        System.out.println("添加" + user);
        return "add";
    }

    @RequestMapping(value = "/select/{i}",method = RequestMethod.GET)
    public String select(@PathVariable int i) {
        System.out.println("查询" + i);
        return "select";
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public String update(@RequestBody User user) {
        System.out.println("更新" + user);
        return "update";
    }

    @RequestMapping(value = "/delete/{i}",method = RequestMethod.DELETE)
    public String delete(@PathVariable int i) {
        System.out.println("删除" + i);
        return "delete";
    }

}
