package com.spacex.www.spring.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

/**
 * @author :sbx
 * @date :2022/2/28 18:14
 * @description :
 * @version: :1.0.0
 */
@Repository
@Aspect //生成代理对象
@Order(2)
public class User2Proxy {



    @Before(value = "execution(* com.spacex.www.spring.aop.annotation.User.add(..))")
    public void before(){
        System.out.println("前置通知2");
    }




}
