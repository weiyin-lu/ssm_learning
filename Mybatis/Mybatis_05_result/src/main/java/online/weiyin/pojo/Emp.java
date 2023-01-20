package online.weiyin.pojo;

import lombok.Data;

@Data
public class Emp {
    private int empId;
    private String empName;
    private int age;
    private String gender;
    private Dept dept; //多对一 多个人员对同一个部门 多对一持有对象
}