package com.spacex.www.spring.ioc.xml;

/**
 * @author :sbx
 * @date :2022/2/16 9:38
 * @description :部门类
 * @version: :1.0.0
 */
public class Dept {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }


    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
