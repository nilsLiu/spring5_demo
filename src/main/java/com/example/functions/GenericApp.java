package com.example.functions;


import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.functions
 * @Author: hai
 * @CreateTime: 2023-03-28  16:17
 * @Version: 1.0
 */

public class GenericApp {


    @Test
    public void testGenericApplicationContext() {
        //1.创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();

        //2.调用context的方法对象注册
        context.refresh();
        context.registerBean("user1", User.class, () -> new User());

        //3.获取在spring注册的对象
        context.getBean("user1");
    }
}
