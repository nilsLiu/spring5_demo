package com.example.JdbcTemplate.dao;

import com.example.JdbcTemplate.entity.Book;

import java.util.List;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.JdbcTemplate.dao
 * @Author: hai
 * @CreateTime: 2023-03-27  10:56
 * @Version: 1.0
 */

public interface BookDao {
    //添加的方法
    void addBook(Book book);



    void updateBook(Book book);

    void deleteById(int id);

    int selectCount();

    Book selectBookInfo(Integer id);

    List<Book> findAllBook();

    void batchAddBook(List<Object[]> batchArgs);

    void batchUpdate(List<Object[]> batchArgs);

    void batchDelete(List<Object[]> batchArgs);
}
