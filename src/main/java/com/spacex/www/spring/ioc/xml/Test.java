package com.spacex.www.spring.ioc.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :sbx
 * @date :2022/1/4 12:14
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring/introduction.xml");
        Book book = applicationContext.getBean("book", Book.class);
        System.out.println(book);
        Orders orders = applicationContext.getBean("orders", Orders.class);
        System.out.println(orders);
        Book book1 = applicationContext.getBean("book1", Book.class);
        System.out.println(book1);
        Book book2 = applicationContext.getBean("book2", Book.class);
        System.out.println(book2);
        Book book3 = applicationContext.getBean("book3", Book.class);
        System.out.println(book3);

    }
}
