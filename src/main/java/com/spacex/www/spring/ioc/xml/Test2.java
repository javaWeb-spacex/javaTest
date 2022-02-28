package com.spacex.www.spring.ioc.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DecimalFormat;
import java.util.Collection;

/**
 * @author :sbx
 * @date :2022/1/5 1:58
 * @description :
 * @version: :1.0.0
 */
public class Test2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/spring/ioc.xml");
        //外部bean
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.print();
        //内部bran
        Emp emp =applicationContext.getBean("emp",Emp.class);
        System.out.println(emp);
        //级联赋值
        Emp emp2 =applicationContext.getBean("emp2",Emp.class);
        System.out.println(emp2);
        Emp emp3 =applicationContext.getBean("emp3",Emp.class);
        System.out.println(emp3);
        //集合属性注入
        CollectionType collectionType =applicationContext.getBean("collectionType",CollectionType.class);
        System.out.println(collectionType.toString());

        //工厂bean
        Dept student =applicationContext.getBean("student",Dept.class);
        System.out.println(student);

        //bean的作用域
        Teach teach1 =applicationContext.getBean("teach",Teach.class);
        System.out.println(teach1);
        Teach teach2 =applicationContext.getBean("teach",Teach.class);
        System.out.println(teach2);

        //bean生命周期
        City city=applicationContext.getBean("city",City.class);
        System.out.println("4.获取bean实例，并使用");
        System.out.println(city);
        //手动让bean实例销毁
        ((ClassPathXmlApplicationContext)applicationContext).close();
        //自动装配



    }
}
