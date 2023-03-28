package com.example.tx.xml.test;

import com.example.tx.anno.service.User1Service;
import com.example.tx.anno_abs.config.TxConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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

        ApplicationContext context =
                new AnnotationConfigApplicationContext(TxConfig.class);
        User1Service userService = context.getBean("user1Service", User1Service.class);
        userService.accountMoney();
    }
}
