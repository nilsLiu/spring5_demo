package com.example.spring5_IOC.autowire;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.spring5_demo
 * @Author: hai
 * @CreateTime: 2023-03-16  10:04
 * @Version: 1.0
 */
public class Order {


    private User user;


    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "user=" + user +
                '}';
    }

    public User getUser() {
        return user;
    }


    public Order() {
    }


}
