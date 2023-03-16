package com.example.spring5_IOC.beanLifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.spring5_demo.beanLifecycle
 * @Author: hai
 * @CreateTime: 2023-03-16  16:55
 * @Version: 1.0
 */
public class beanLifecycleTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("IOC/beanLifecycle.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("4. 获取创建bean的实例");
        System.out.println(orders);

        //手动销毁bean实例
        context.close();
    }
}
