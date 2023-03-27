package com.example.JdbcTemplate.test;

import com.example.JdbcTemplate.entity.Book;
import com.example.JdbcTemplate.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.JdbcTemplate.test
 * @Author: hai
 * @CreateTime: 2023-03-27  15:53
 * @Version: 1.0
 */

public class testBook {

    @Test
    public void testJdbcTemplate() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("Jdbc/JdbcBean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        Book book = new Book();
        book.setBookId(1);
        book.setBookName("局外人");
        book.setAuthor("加缪");
//        bookService.addBook(book);

//        bookService.deleteById(2);

//        bookService.updateBook(book);

//        System.out.println(bookService.findCount());
//        List<Book> all = bookService.findAll();
//        System.out.println(all);

        //批量添加
//        ArrayList<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {6, "朝花夕拾", "鲁迅"};
//        Object[] o2 = {7, "朝花夕拾", "鲁迅"};
//        Object[] o3 = {8, "朝花夕拾", "鲁迅"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);

//        bookService.batchAdd(batchArgs);

    }
}
