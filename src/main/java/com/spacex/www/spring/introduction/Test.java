package com.spacex.www.spring.introduction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :sbx
 * @date :2021/12/20 23:26
 * @description :
 * @version: :1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Logger logger= LoggerFactory.getLogger(Test.class);
        //加载spring的配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring/introduction.xml");
        User user =  context.getBean("User",User.class);
        user.setName("sbx");
        user.setAge(25);
       logger.info("Name:"+user.getName()+"Age:"+user.getAge());

    }
}
