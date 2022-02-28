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
@Order(1)
public class UserProxy {


    //相同切入点抽取
    @Pointcut(value = "execution(* com.spacex.www.spring.aop.annotation.User.add(..))")
    public void pointcut(){

    }

    //@Before表示作为前置通知
//    @Before(value = "execution(* com.spacex.www.spring.aop.annotation.User.add(..))")
    @Before(value = "pointcut()")
    public void before(){
        System.out.println("前置通知");
    }

    @After("execution(* com.spacex.www.spring.aop.annotation.User.add(..))")
    public  void after(){
        System.out.println("最终通知");
    }


    @AfterReturning("execution(* com.spacex.www.spring.aop.annotation.User.add(..))")
    public void afterReturning(){
        System.out.println("后置通知");
    }

    @AfterThrowing("execution(* com.spacex.www.spring.aop.annotation.User.add(..))")
    public void  afterThrowing(){
        System.out.println("异常通知");
    }

    @Around("execution(* com.spacex.www.spring.aop.annotation.User.add(..))")
    public  void  around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前");

        //被增强的方法执行
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后");
    }


}
