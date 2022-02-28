package com.spacex.www.spring.ioc.xml;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author :sbx
 * @date :2022/2/16 9:40
 * @description :员工类
 * @version: :1.0.0
 */
public class Emp {
    private String ename;
    private String gender;
    private Dept dept;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                '}';
    }
}
