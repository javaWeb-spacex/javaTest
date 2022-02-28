package com.spacex.www.spring.aop.proxy.dinamic.cglib;

public class UserDao {
    public int insert() {
        System.out.println("添加");
        return 0;
    }
}