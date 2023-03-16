package com.example.spring5_IOC.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.spring5_demo.autowire
 * @Author: hai
 * @CreateTime: 2023-03-16  20:30
 * @Version: 1.0
 */
public class AutowireTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("IOC/Autowire.xml");
        Order order = context.getBean("order", Order.class);
        System.out.println(order);

    }
}
