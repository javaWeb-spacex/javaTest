package com.spacex.www.spring.ioc.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author :sbx
 * @date :2022/2/22 21:13
 * @description :
 * @version: :1.0.0
 */
@Configuration //将当前类作为配置类，替代xml配置文件
@ComponentScan(basePackages = {"com.spacex.www.spring.ioc.xml"})
public class SpringConfig {
}
