package com.spacex.www.spring.ioc.introduction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author :sbx
 * @date :2021/12/20 23:26
 * @description :
 * @version: :1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Test.class);
        //加载spring的配置文件
        BeanFactory beanFactory=new XmlBeanFactory( new ClassPathResource("/spring/introduction.xml"));
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/introduction.xml");
//        User user = context.getBean("user", User.class);
        User user = beanFactory.getBean("user", User.class);
        user.setName("sbx");
        user.setAge(25);
        logger.info("Name:" + user.getName() + "Age:" + user.getAge());
        user.print();


        Date data=new Date();
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("ssss"+ simpleDateFormat.format(data));
    }
}
