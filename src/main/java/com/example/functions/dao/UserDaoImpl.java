package com.example.functions.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.tx.dao
 * @Author: hai
 * @CreateTime: 2023-03-28  10:10
 * @Version: 1.0
 */

@Repository
public class UserDaoImpl implements UserDao {

    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney() {
        String sql = "update t_account set money=money+? where username=?";
        jdbcTemplate.update(sql, 100, "mark");
    }

    @Override
    public void reduceMoney() {
        String sql = "update t_account set money=money-? where username=? ";
        jdbcTemplate.update(sql, 100, "jack");
    }
}
