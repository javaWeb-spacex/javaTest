package com.spacex.www.spring.ioc.theory;

/**
 * @author :sbx
 * @date :2021/12/21 23:14
 * @description :
 * @version: :1.0.0
 */
public class UserService {
//    public static void main(String[] args) {
    public void execute(){
        //原始方式
        UserDao userDao = new UserDao();
        userDao.add();
        //工场方式 --该方式降低了UserService和UserDao之间的耦合度，但UserFactory和UserFactory、UserFactory和UserDao 之间的耦合度还是非常的高
        UserFactory userFactory=new UserFactory();
        UserDao userDao1 = userFactory.getUserDao();
        userDao1.add();

    }
}
