package com.spacex.www.spring.ioc.xml;

import org.springframework.beans.factory.FactoryBean;

import javax.annotation.Resource;

/**
 * @author :sbx
 * @date :2022/2/17 16:30
 * @description :
 * @version: :1.0.0
 */
public class Student implements FactoryBean<Dept> {

    @Override
    //定义返回bean
    public Dept getObject() throws Exception {
        Dept dept=new Dept();
        dept.setDname("abcd");
        return dept;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
