package com.spacex.www.spring.tx.annotation.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author :sbx
 * @date :2022/3/2 19:33
 * @description :
 * @version: :1.0.0
 */
@Repository
public class AccountDaoImpl implements com.spacex.www.spring.tx.annotation.dao.AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney() {
        String sql="update t_account set money=money+? where username=?";
        jdbcTemplate.update(sql,100,"zhangsan");
    }

    @Override
    public void reduceMoney() {
        String sql="update t_account set money=money-? where username=?";
        jdbcTemplate.update(sql,100,"lisi");
    }
}
