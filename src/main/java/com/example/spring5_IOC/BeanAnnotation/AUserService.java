package com.example.spring5_IOC.BeanAnnotation;

import org.springframework.stereotype.Component;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.spring5_IOC.Service
 * @Author: hai
 * @CreateTime: 2023-03-16  21:28
 * @Version: 1.0
 */

//在注解里面的value属性值可以省略，
//默认值是类名称，首字母小写
//AUserService -> aUserService

@Component(value = "aUserService") //与<bean id = "AUserService" class = " "> 类似

public class AUserService {

    public void test() {
        System.out.println("test---------");
    }
}
