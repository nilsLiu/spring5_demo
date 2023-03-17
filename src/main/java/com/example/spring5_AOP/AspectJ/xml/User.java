package com.example.spring5_AOP.AspectJ.xml;

import org.springframework.stereotype.Component;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.spring5_AOP.AspectJ
 * @Author: hai
 * @CreateTime: 2023-03-17  15:58
 * @Version: 1.0
 */

//被增强的类
@Component
public class User {
    public void add() {
        System.out.println("这是add方法");
    }
}
