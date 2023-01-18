package online.weiyin.controller;

import online.weiyin.pojo.Emp;
import online.weiyin.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //RESTful风格综合注解
@RequestMapping("/emps") //url前缀
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/")
    public List<Emp> getAll() {
        System.out.println("查询所有");
        return empService.getAll();
    }
    @GetMapping("/{empId}")
    public Emp getById(@PathVariable int empId) {
        System.out.println("按id查询");
        return empService.getById(empId);
    }

    @DeleteMapping("/{empId}")
    public String deleteById(@PathVariable int empId) {
        System.out.println("删除" + empId);
        empService.deleteById(empId);
        return "complete";
    }
}
