package com.example.spring5_demo.Dao;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.spring5_demo.Dao
 * @Author: hai
 * @CreateTime: 2023-03-16  11:29
 * @Version: 1.0
 */
public class UserDaoImpl implements UserDao{

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public void update() {
        System.out.println("dao update");
    }
}
