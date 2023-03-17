package com.example.spring5_IOC.BeanAnnotation;

import org.springframework.stereotype.Repository;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.spring5_IOC.BeanAnnotation
 * @Author: hai
 * @CreateTime: 2023-03-17  14:06
 * @Version: 1.0
 */

@Repository("aUserDaoImpl1")
public class AUserDaoImpl implements AUserDao{
    @Override
    public void add() {
        System.out.println("这是AUserDaoImpl的add()");
    }
}
