package com.spacex.www.spring.ioc.xml;

/**
 * @author :sbx
 * @date :2022/1/5 1:45
 * @description :
 * @version: :1.0.0
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void print(){
        System.out.println("UserService add.....");
        userDao.add();
    }
}
