package com.example.spring5_AOP.JDK_Proxy;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.spring5_AOP.JDK_Proxy
 * @Author: hai
 * @CreateTime: 2023-03-17  15:09
 * @Version: 1.0
 */

public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行");
        return a + b;
    }

    @Override
    public String setName(String name) {
        System.out.println("setName方法执行");
        return name;
    }
}
