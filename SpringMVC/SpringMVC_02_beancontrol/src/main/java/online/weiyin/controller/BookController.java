package online.weiyin.controller;

import online.weiyin.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping("/save") //访问路径设置
    @ResponseBody //把返回值作为响应体返回
    public String save() {
        System.out.println("BookController save run");
        bookService.serve();
        return "{'ret':'BookController save run'}";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update() {
        System.out.println("BookController update run");
        return "{'ret':'BookController update run'}";
    }
}
