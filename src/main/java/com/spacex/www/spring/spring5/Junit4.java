package com.spacex.www.spring.spring5;

import com.spacex.www.spring.tx.annotation.dao.AccountDao;
import com.spacex.www.spring.tx.annotation.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author :sbx
 * @date :2022/3/3 19:53
 * @description :
 * @version: :1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class) //指定使用的junit的版本
@ContextConfiguration("classpath:spring/txAnnotation.xml") //加载配置文件
public class Junit4 {

    @Autowired
    private AccountService accountService;

    @Test
    public void junit4(){
        accountService.accountMoney();
    }
}
