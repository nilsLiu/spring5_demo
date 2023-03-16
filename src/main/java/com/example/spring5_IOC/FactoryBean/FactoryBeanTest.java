package com.example.spring5_IOC.FactoryBean;

import com.example.spring5_IOC.collectionType.Course;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.spring5_demo.FactoryBean
 * @Author: hai
 * @CreateTime: 2023-03-16  16:21
 * @Version: 1.0
 */
public class FactoryBeanTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("IOC/FactoryBean.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);

    }
}
