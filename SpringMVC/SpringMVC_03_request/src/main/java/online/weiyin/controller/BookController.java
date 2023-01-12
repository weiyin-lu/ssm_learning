package online.weiyin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/book") //本类全局前缀 拼接成/book/xxx
public class BookController {


    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        System.out.println("BookController save run");
        return "{'ret':'BookController save run'}";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update() {
        System.out.println("BookController update run");
        return "{'ret':'BookController update run'}";
    }

    /**
     * 请求的路径必须唯一
     */
}
