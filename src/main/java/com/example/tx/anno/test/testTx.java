package com.example.tx.anno.test;

import com.example.tx.anno.service.User1Service;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
                new ClassPathXmlApplicationContext("tx/tx_anno.xml");
        User1Service userService = context.getBean("userService", User1Service.class);
        userService.accountMoney();
    }
}
