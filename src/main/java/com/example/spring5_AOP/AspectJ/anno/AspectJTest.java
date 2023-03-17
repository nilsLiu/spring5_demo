package com.example.spring5_AOP.AspectJ.anno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.spring5_AOP.AspectJ
 * @Author: hai
 * @CreateTime: 2023-03-17  16:16
 * @Version: 1.0
 */

public class AspectJTest {
    @Test
    public void testAopAnno(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("AOP/AspectJ_anno.xml");
        User user = context.getBean("user", User.class);

        user.add();
    }

}
