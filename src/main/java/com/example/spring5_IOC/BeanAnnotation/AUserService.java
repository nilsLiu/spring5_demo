package com.example.spring5_IOC.BeanAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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

//@Component(value = "aUserService") //与<bean id = "AUserService" class = " "> 类似
@Service("aUserService")
public class AUserService {

    //定义dao属性
    //不需要添加set方法
    //添加注入属性注解
    @Autowired
    @Qualifier(value = "aUserDaoImpl1")
    private AUserDao aUserDao;

    @Resource(name = "aUserDaoImpl1")
    private AUserDao aUserDao2;

    @Value("abc")
    private String name;

    public void test() {
        System.out.println("test---------" + name);
        aUserDao.add();
        aUserDao2.add();
    }
}
