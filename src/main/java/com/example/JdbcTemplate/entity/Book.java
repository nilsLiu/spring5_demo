package com.example.JdbcTemplate.entity;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.JdbcTemplate.entity
 * @Author: hai
 * @CreateTime: 2023-03-27  11:24
 * @Version: 1.0
 */

public class Book {

    private int bookId;
    private String bookName;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String author;


}
