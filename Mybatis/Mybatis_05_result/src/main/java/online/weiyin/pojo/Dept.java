package online.weiyin.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Dept {
    private int deptId;
    private String deptName;
    private List<Emp> emps; //一对多 一个部门对多个人员 一对多持有集合
}
