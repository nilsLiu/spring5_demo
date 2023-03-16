package com.example.spring5_demo.Service;

import com.example.spring5_demo.Dao.UserDao;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.spring5_demo.Service
 * @Author: hai
 * @CreateTime: 2023-03-16  11:29
 * @Version: 1.0
 */
public class UserService {

    public UserDao getUserDao() {
        return userDao;
    }

    private UserDao userDao;


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service --- add");
        userDao.update();
    };

}
