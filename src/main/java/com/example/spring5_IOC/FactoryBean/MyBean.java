package com.example.spring5_IOC.FactoryBean;

import com.example.spring5_IOC.collectionType.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.spring5_demo.FactoryBean
 * @Author: hai
 * @CreateTime: 2023-03-16  16:10
 * @Version: 1.0
 */
public class MyBean implements FactoryBean {

    @Override
    public Course getObject() throws Exception {
        //定义返回bean
        Course course = new Course();
        course.setCourseName("English");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
