package com.spacex.www.spring.ioc.annotation;

import com.spacex.www.spring.ioc.xml.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author :sbx
 * @date :2022/2/22 21:18
 * @description :
 * @version: :1.0.0
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Book book = applicationContext.getBean("book", Book.class);
        System.out.println(book);
    }
}
