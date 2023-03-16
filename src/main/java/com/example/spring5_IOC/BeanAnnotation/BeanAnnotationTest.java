package com.example.spring5_IOC.BeanAnnotation;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.spring5_IOC.BeanAnnotation
 * @Author: hai
 * @CreateTime: 2023-03-16  21:22
 * @Version: 1.0
 */
public class BeanAnnotationTest {

    @Test
    public void testAUserService(){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("IOC/BeanAnnotation.xml");
        AUserService aUserService = context.getBean("aUserService", AUserService.class);
        aUserService.test();
    }
}
