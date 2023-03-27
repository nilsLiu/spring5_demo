package com.example.JdbcTemplate.dao;

import com.example.JdbcTemplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.JdbcTemplate.dao
 * @Author: hai
 * @CreateTime: 2023-03-27  10:56
 * @Version: 1.0
 */

@Repository
public class BookDaoImpl implements BookDao {

    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //添加的方法
    @Override
    public void addBook(Book book) {
        //1.创建sql语句
        String sql = "insert into t_book values(?,?,?)";
        //2.调用方法实现
        int update = jdbcTemplate.update(sql, book.getBookId(), book.getBookName(), book.getAuthor());
        System.out.println(update);
    }

    //修改
    @Override
    public void updateBook(Book book) {
        String sql = "update t_book set bookname=?,author=? where bookid=?";
        Object[] args = {book.getBookName(), book.getAuthor(), book.getBookId()};
        jdbcTemplate.update(sql, args);
    }

    @Override
    public void deleteById(int id) {
        String sql = "delete from t_book where bookid=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public List<Book> findAllBook() {
        String sql = "select * from t_book";
        List<Book> bookList =
                jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }

    @Override
    public void batchUpdate(List<Object[]> batchArgs) {
        String sql = "update t_book set bookname=?,author=? where bookid=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(ints);
    }

    @Override
    public void batchDelete(List<Object[]> batchArgs) {
        String sql = "delete from t_book where bookid=?";
        jdbcTemplate.batchUpdate(sql,batchArgs);
    }

    //批量添加
    @Override
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql = "insert into t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    //查询表内记录数
    @Override
    public int selectCount() {
        String sql = "select count(*) from t_book";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public Book selectBookInfo(Integer id) {
        String sql = "select * from t_book where id=?";
        Book book =
                jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }
}
