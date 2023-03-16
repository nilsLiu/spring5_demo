package com.example.spring5_IOC.beanLifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.spring5_demo.beanLifecycle
 * @Author: hai
 * @CreateTime: 2023-03-16  17:10
 * @Version: 1.0
 */
public class MyBeanPost implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("在初始化之前执行的方法");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("在初始化之后执行的方法");
        return bean;
    }
}
