package com.spacex.www.spring.aop.annotation;

import org.springframework.stereotype.Component;

/**
 * @author :sbx
 * @date :2022/2/28 18:12
 * @description :
 * @version: :1.0.0
 */
@Component
public class User {
    public void add(){
        System.out.println("add........");
    }

    public void delete(){
        System.out.println("delete..........");
    }
}
