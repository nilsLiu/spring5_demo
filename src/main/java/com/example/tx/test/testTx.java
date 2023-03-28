package com.example.tx.test;

import com.example.tx.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.tx.test
 * @Author: hai
 * @CreateTime: 2023-03-28  10:33
 * @Version: 1.0
 */

public class testTx {

    @Test
    public void testAccount() {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("tx/tx_Bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
}
