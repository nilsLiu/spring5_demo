package com.example.spring5_IOC.collectionType;

import java.util.List;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.spring5_demo.collectionType
 * @Author: hai
 * @CreateTime: 2023-03-16  15:47
 * @Version: 1.0
 */
public class Book {
    private List<String> bookList;

    public void setBookList(List<String> bookList) {
        this.bookList = bookList;
    }

    public void test(){
        System.out.println(bookList);
    }

}
