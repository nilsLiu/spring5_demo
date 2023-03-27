package com.example.JdbcTemplate.service;

import com.example.JdbcTemplate.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.JdbcTemplate.service
 * @Author: hai
 * @CreateTime: 2023-03-27  10:56
 * @Version: 1.0
 */

@Service
public class BookService {

    //注入dao
    @Autowired
    private BookDao bookDao;
}
