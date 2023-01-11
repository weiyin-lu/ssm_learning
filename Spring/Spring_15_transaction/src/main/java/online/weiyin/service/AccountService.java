package online.weiyin.service;

import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

public interface AccountService {
    @Transactional(rollbackFor = {IOException.class}) //在该方法上启动事务功能（一般在接口写），spring实现了在业务层打包数据层事务并统一管理，称为事务管理员
    Boolean transfer(int userAId, int userBId, int M) throws IOException;
    /**
     * 默认事务模式只能回滚Error和所有RuntimeException，无法回滚其他异常，如IOException
     * rollbackFor : 设置会触发事务回滚的异常类型
     * propagation : 设置事务传播行为(枚举类型)
     *      REQUIRED（默认） : 管理员开启T，协调员加入T；管理员无操作，协调员新建T2
     *      REQUIRES_NEW : 管理员开启T，协调员新建T2；管理员无操作，协调员新建T2
     *      SUPPORTS : 管理员开启T，协调员加入T；管理员无操作，协调员无操作
     *      NOT_SUPPORTED : 管理员开启T，协调员无操作；管理员无操作
     *      MANDATORY : 管理员开启T 协调员加入T；管理员无操作，协调员ERROR
     *      NEVER : 管理员开启T，协调员ERROR；管理员无操作，协调员无操作
     *      NESTED : 设置savepoint，一旦回滚会回到saveporint处，交给客户端响应提交/回滚
     */
}
