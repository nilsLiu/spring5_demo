package com.example.spring5_IOC.autowire;

public class User {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void add() {
        System.out.println("add");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public void testUser() {
        System.out.println(name);
    }

}
