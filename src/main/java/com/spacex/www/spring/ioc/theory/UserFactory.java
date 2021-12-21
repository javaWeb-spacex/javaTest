package com.spacex.www.spring.ioc.theory;


import static java.lang.Class.forName;

/**
 * @author :sbx
 * @date :2021/12/21 23:17
 * @description :
 * @version: :1.0.0
 */
public class UserFactory {
    public UserDao getUserDao(){
        return new UserDao();
    }
//    public  UserDao getUser(){
//       String classPath ="class属性"; //1.xml解析的方式，获取类的全限定类名
//       Class clazz=Class.forName(classPath); //反射的方式获取该对象
//       return  clazz.newInstance(); //调用构造方法，并将创建的对象返回
//    }
}
