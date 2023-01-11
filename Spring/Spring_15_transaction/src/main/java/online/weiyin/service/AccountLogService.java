package online.weiyin.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface AccountLogService {
    @Transactional(propagation = Propagation.REQUIRES_NEW) //该属性让该方法始终创建一个新事务
    int log(int userA,int userB,int money);
}
