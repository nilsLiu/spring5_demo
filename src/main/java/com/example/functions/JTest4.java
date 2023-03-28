package com.example.functions;

import com.example.functions.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.functions
 * @Author: hai
 * @CreateTime: 2023-03-28  16:28
 * @Version: 1.0
 */

@SpringJUnitConfig(locations = "classpath:log4j2.xml")
public class JTest4 {
    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        userService.accountMoney();
    }

}
