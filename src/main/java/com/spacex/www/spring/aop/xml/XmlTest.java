package com.spacex.www.spring.aop.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :sbx
 * @date :2022/2/28 22:00
 * @description :
 * @version: :1.0.0
 */
public class XmlTest {
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring/aopXml.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();

    }
}
