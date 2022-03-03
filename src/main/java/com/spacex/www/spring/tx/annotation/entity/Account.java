package com.spacex.www.spring.tx.annotation.entity;

/**
 * @author :sbx
 * @date :2022/3/2 19:30
 * @description :
 * @version: :1.0.0
 */
public class Account {
    private String id;
    private  String userName;
    private Integer money;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", money=" + money +
                '}';
    }
}
