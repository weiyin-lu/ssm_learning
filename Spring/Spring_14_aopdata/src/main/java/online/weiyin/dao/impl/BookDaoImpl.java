package online.weiyin.dao.impl;

import online.weiyin.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public String save(int id,String name) {
        System.out.println("args:" + id + "," + name);
//        if(true) throw new RuntimeException("测试异常");
        return "return:weiyin";
    }
}
