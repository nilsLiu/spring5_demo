package com.example.spring5_IOC.beanLifecycle;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.spring5_demo.beanLifecycle
 * @Author: hai
 * @CreateTime: 2023-03-16  16:49
 * @Version: 1.0
 */
public class Orders {

    //无参构造
    public Orders() {
        System.out.println("1. 执行了无参构造bean实例");
    }


    public void setOrderName(String orderName) {
        OrderName = orderName;
        System.out.println("2. 调用set方法设置值");
    }

    private String OrderName;

    //创建执行初始化的方法
    public void initMethod() {
        System.out.println("3. 执行初始化的方法");
    }

    //创建销毁时使用的方法
    public void destroyMethod() {
        System.out.println("5. 执行bean销毁的方法");
    }
}
