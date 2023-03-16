package com.example.spring5_IOC;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.spring5_demo
 * @Author: hai
 * @CreateTime: 2023-03-16  10:04
 * @Version: 1.0
 */
public class Order {
    private int id;
    private String name;

    public Order(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    private String address;

    public Order(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void orderTest(){
        System.out.println(id + " --- " + name);
    }
}
