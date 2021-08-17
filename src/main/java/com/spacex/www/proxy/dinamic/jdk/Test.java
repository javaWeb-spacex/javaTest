package com.spacex.www.proxy.dinamic.jdk;

public class Test {

    private UserDao userDao = (UserDao) new UserDaoProxy(new UserDaoImpl()).getProxy();

    @org.junit.Test
    public void demo() {
        userDao.insert();
    }
}
