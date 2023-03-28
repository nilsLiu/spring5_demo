package com.example.functions;

import com.example.functions.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.functions
 * @Author: hai
 * @CreateTime: 2023-03-28  17:20
 * @Version: 1.0
 */

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:log4j2.xml")
public class JTest5 {

    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        userService.accountMoney();
    }
}
