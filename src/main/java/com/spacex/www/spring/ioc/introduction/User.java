package com.spacex.www.spring.ioc.introduction;

import lombok.Data;

/**
 * @author :sbx
 * @date :2021/12/20 23:23
 * @description :
 * @version: :1.0.0
 */
@Data
public class User {
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }
    public void print(){
        System.out.println("User print");
    }


}
