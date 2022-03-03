package com.spacex.www.spring.spring5;

import com.spacex.www.spring.tx.annotation.service.AccountService;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author :sbx
 * @date :2022/3/3 20:16
 * @description :
 * @version: :1.0.0
 */
//@ExtendWith(SpringExtension.class) //指定使用的junit的版本
//@ContextConfiguration("classpath:spring/txAnnotation.xml") //加载配置文件
@SpringJUnitConfig(locations = "classpath:spring/txAnnotation.xml") //相当于上面的两个注解
public class Junit5 {

    @Autowired
    private AccountService accountService;

    @Test
    public void junit5(){
        accountService.accountMoney();
    }
}