package com.example.spring5_AOP.AspectJ.xml;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.spring5_AOP.AspectJ
 * @Author: hai
 * @CreateTime: 2023-03-17  16:00
 * @Version: 1.0
 */


//增强类
public class UserProxy {


    public void before(){
        System.out.println("before");
    }

    //最终通知
    //after 方法执行之后执行

    public void after(){
        System.out.println("after");
    }

    //AfterReturning 后置通知（返回通知）
    public void afterReturning(){
        System.out.println("afterReturning");
    }

    //异常通知

    public void afterThrowing(){
        System.out.println("afterThrowing");
    }

    //环绕通知
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕之前");

        proceedingJoinPoint.proceed();

        System.out.println("环绕之后");
    }
}
