package com.spacex.www.spring.jdbcTemplate.test;

import com.spacex.www.spring.jdbcTemplate.entity.Book;
import com.spacex.www.spring.jdbcTemplate.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :sbx
 * @date :2022/3/1 18:30
 * @description :
 * @version: :1.0.0
 */
public class JDBCTemplateTest {
    //添加
    @Test
    public void addTest(){
        ApplicationContext context =new ClassPathXmlApplicationContext("spring/jdbcTemplate.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setId("2");
        book.setName("西游记");
        book.setStatus("0");
        bookService.addBook(book);
    }

    //修改
    @Test
    public void updateTest(){
        ApplicationContext context =new ClassPathXmlApplicationContext("spring/jdbcTemplate.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setId("1");
        book.setName("红楼梦1");
        book.setStatus("0");
        bookService.updateBook(book);
    }

    //删除
    @Test
    public void deleteTest(){
        ApplicationContext context =new ClassPathXmlApplicationContext("spring/jdbcTemplate.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.deleteBook("2");
    }


    //查询
    @Test
    public void query(){
        ApplicationContext context =new ClassPathXmlApplicationContext("spring/jdbcTemplate.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        //查询返回某个值
       bookService.queryCount();
       //查询返回一个对象
       bookService.queryBook("1");
       //查询返回一个列表
        bookService.queryBooks();
    }


    //批量添加
    @Test
    public void batchAddTest(){
        ApplicationContext context =new ClassPathXmlApplicationContext("spring/jdbcTemplate.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs =new ArrayList<>();
        Object[] o1={"3","java","1"};
        Object[] o2={"4","python","0"};
        Object[] o3={"5","c++","1"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchAdd(batchArgs);
    }

    //批量修改
    @Test
    public void batchUpdateTest(){
        ApplicationContext context =new ClassPathXmlApplicationContext("spring/jdbcTemplate.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs =new ArrayList<>();
        Object[] o1={"0","3"};
        Object[] o2={"0","4"};
        Object[] o3={"0","5"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchUpdate(batchArgs);
    }

    //批量删除
    @Test
    public void batchDeleteTest(){
        ApplicationContext context =new ClassPathXmlApplicationContext("spring/jdbcTemplate.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs =new ArrayList<>();
        Object[] o1={"3"};
        Object[] o2={"4"};
        Object[] o3={"5"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchDelete(batchArgs);

    }
}
