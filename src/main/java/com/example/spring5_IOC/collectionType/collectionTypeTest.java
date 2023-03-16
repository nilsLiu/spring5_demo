package com.example.spring5_IOC.collectionType;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.spring5_demo.collectionType
 * @Author: hai
 * @CreateTime: 2023-03-16  15:32
 * @Version: 1.0
 */

public class collectionTypeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("IOC/collectionType.xml");
        Stu stu = context.getBean("stu", Stu.class);

        stu.test();

    }

    @Test
    public void testBook(){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("IOC/collectionType2.xml");
        Book book = context.getBean("book", Book.class);

        book.test();
    }
}
