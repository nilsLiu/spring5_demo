package com.example.spring5_IOC;

public class User {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void add() {
        System.out.println("add");
    }

    public void testDemo() {
        System.out.println(name);
    }

}
