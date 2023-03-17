package com.example.spring5_AOP.AspectJ.anno;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.spring5_AOP.AspectJ
 * @Author: hai
 * @CreateTime: 2023-03-17  16:44
 * @Version: 1.0
 */

@Component
@Aspect
@Order(1)
public class UserProxy1 {
    //AfterReturning 后置通知（返回通知）
    @AfterReturning(value = "execution(* com.example.spring5_AOP.AspectJ.anno.User.add())")
    public void afterReturning(){
        System.out.println("afterReturning1");
    }
}
