package com.spacex.www.proxy.dinamic.cglib;

public class UserDaoTest {
    public static void main(String[] args) {
        UserDao userDao=new UserDao();
        UserDaoProxy userDaoProxy=new UserDaoProxy(userDao);
        UserDao proxy = (UserDao) userDaoProxy.getProxy();
        proxy.insert();
    }
}