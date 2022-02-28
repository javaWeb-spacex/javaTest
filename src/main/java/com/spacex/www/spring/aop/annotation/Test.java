package com.spacex.www.spring.aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :sbx
 * @date :2022/2/28 18:35
 * @description :
 * @version: :1.0.0
 */
public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/aop.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
