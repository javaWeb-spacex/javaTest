package com.spacex.www.spring.ioc.introduction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :sbx
 * @date :2021/12/20 23:23
 * @description :
 * @version: :1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private Integer age;

    public void print(){
        System.out.println("User print");
    }
}
