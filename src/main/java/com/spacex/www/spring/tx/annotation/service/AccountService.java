package com.spacex.www.spring.tx.annotation.service;

import com.spacex.www.spring.tx.annotation.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author :sbx
 * @date :2022/3/2 19:32
 * @description :
 * @version: :1.0.0
 */
@Service
public class AccountService {
    @Autowired
    private AccountDao accountDao;

    @Transactional
    public void accountMoney(){
        accountDao.addMoney();

        int a=100/0;

        accountDao.reduceMoney();
    }

}
