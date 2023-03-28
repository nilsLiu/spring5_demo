package com.example.tx.anno_abs.service;

import com.example.tx.anno_abs.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.tx.service
 * @Author: hai
 * @CreateTime: 2023-03-28  10:10
 * @Version: 1.0
 */

@Service
@Transactional(timeout = -1)
public class UserService {

    //注入dao
    @Autowired
    private UserDao userDao;

    //转账的方法
    public void accountMoney() {
//        try {
            //1.开启事务

            //2.进行业务操作
            userDao.reduceMoney();

            //模拟异常
            int i = 10/0;
            userDao.addMoney();

            //3.无异常。提交事务
//        }catch (Exception e){
            //4.出现异常，事务回滚
//        }

    }
}
