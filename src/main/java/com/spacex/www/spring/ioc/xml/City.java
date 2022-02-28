package com.spacex.www.spring.ioc.xml;

/**
 * @author :sbx
 * @date :2022/2/18 14:52
 * @description :
 * @version: :1.0.0
 */
public class City {
    private String name;

    public City() {
        System.out.println("1.执行了无参数的构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2.调用set方法为属性赋值");
    }

    public void initCity() {
        System.out.println("3.执行初始化方法");
    }

    public void destory() {
        System.out.println("5.执行bean实例的销毁方法");
    }
}
