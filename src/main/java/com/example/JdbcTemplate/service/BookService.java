package com.example.JdbcTemplate.service;

import com.example.JdbcTemplate.dao.BookDao;
import com.example.JdbcTemplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    //添加的方法
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    //删除
    public void deleteById(int id) {
        bookDao.deleteById(id);
    }

    //修改
    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    //查询表内记录数
    public int findCount() {
        return bookDao.selectCount();
    }

    //查询返回对象
    public Book findOne(Integer id) {
        return bookDao.selectBookInfo(id);
    }

    //查询返回集合
    public List<Book> findAll(){
        return bookDao.findAllBook();
    }

    //批量添加
    public void batchAdd(List<Object[]> batchArgs) {
        bookDao.batchAddBook(batchArgs);
    }

    //批量修改
    public void batchUpdate(List<Object[]> batchArgs) {
        bookDao.batchUpdate(batchArgs);
    }

    //批量删除
    public void batchDelete(List<Object[]> batchArgs) {
        bookDao.batchDelete(batchArgs);
    }
}
