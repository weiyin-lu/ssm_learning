package online.weiyin.service;

import org.springframework.transaction.annotation.Transactional;

public interface AccountService {
    @Transactional //在该方法上启动事务功能（一般在接口写），spring实现了在业务层打包数据层事务并统一管理，称为事务管理员
    Boolean transfer(int userAId, int userBId, int M);
}
