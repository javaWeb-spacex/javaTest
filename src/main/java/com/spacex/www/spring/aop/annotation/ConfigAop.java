package com.spacex.www.spring.aop.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author :sbx
 * @date :2022/2/28 22:05
 * @description :
 * @version: :1.0.0
 */
@Configuration
@ComponentScan(basePackages = {"com.spacex.www.spring.aop.annotation"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}
