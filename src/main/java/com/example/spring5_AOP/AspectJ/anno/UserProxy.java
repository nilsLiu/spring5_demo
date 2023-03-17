package com.example.spring5_AOP.AspectJ.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.spring5_AOP.AspectJ
 * @Author: hai
 * @CreateTime: 2023-03-17  16:00
 * @Version: 1.0
 */

@Component
@Aspect
@Order(2)
//增强类
public class UserProxy {

    //相同的切入点抽取
    @Pointcut(value = "execution(* com.example.spring5_AOP.AspectJ.anno.User.add())")
    public void pointDemo(){}


    //前置方法
    @Before(value = "pointDemo()")
    public void before(){
        System.out.println("before");
    }

    //最终通知
    //after 方法执行之后执行
    @After(value = "pointDemo()")
    public void after(){
        System.out.println("after");
    }

    //AfterReturning 后置通知（返回通知）
    @AfterReturning(value = "pointDemo()")
    public void afterReturning(){
        System.out.println("afterReturning");
    }

    //异常通知
    @AfterThrowing(value = "pointDemo()")
    public void afterThrowing(){
        System.out.println("afterThrowing");
    }

    //环绕通知
    @Around(value = "pointDemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕之前");

        proceedingJoinPoint.proceed();

        System.out.println("环绕之后");
    }
}
