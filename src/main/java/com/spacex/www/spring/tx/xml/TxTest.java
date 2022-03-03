package com.spacex.www.spring.tx.xml;

import com.spacex.www.spring.tx.annotation.service.AccountService;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :sbx
 * @date :2022/3/2 19:40
 * @description :
 * @version: :1.0.0
 */
public class TxTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/txXml.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.accountMoney();
    }

}
