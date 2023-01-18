package online.weiyin.controller;

import online.weiyin.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books") //RESTful风格，起始路径用复数形式
public class BookController {

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public String add(@RequestBody User user) {
        System.out.println("添加" + user);
        return "add";
    }

    @RequestMapping(value = "/select/{i}",method = RequestMethod.GET)
    @ResponseBody
    public String select(@PathVariable int i) {
        System.out.println("查询" + i);
        return "select";
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody User user) {
        System.out.println("更新" + user);
        return "update";
    }

    @RequestMapping(value = "/delete/{i}",method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable int i) {
        System.out.println("删除" + i);
        return "delete";
    }

}
