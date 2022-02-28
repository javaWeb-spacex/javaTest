package com.spacex.www.spring.ioc.xml;

import lombok.Data;

/**
 * @author :sbx
 * @date :2022/1/5 1:45
 * @description :
 * @version: :1.0.0
 */
@Data
public class UserDaoImpl implements  UserDao{
    @Override
    public void add() {
        System.out.println("UserDao add ....");
    }
}
