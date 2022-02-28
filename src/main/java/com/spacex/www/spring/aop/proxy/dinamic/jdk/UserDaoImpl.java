package com.spacex.www.spring.aop.proxy.dinamic.jdk;

public class UserDaoImpl implements UserDao {
    @Override
    public int insert() {
        System.out.println("添加");
        return 0;
    }
}