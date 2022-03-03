package com.spacex.www.spring.spring5;

import com.spacex.www.spring.ioc.introduction.User;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author :sbx
 * @date :2022/3/2 21:32
 * @description :
 * @version: :1.0.0
 */
public class Test {
    /**Spring5 框架核心容器支持函数式风格GenericApplicationContext*/
    @org.junit.Test
    public void testGenericApplicationContext(){
        //1.创建GenericApplicationContext对象
        GenericApplicationContext context=new GenericApplicationContext();
        //2.调用context方法将对象注册到spring容器中
        //将内容清空
        context.refresh();
        context.registerBean(User.class,()->new User());
        //获取注册的对象
        User user = (User) context.getBean("com.spacex.www.spring.ioc.introduction.User");
        System.out.println(user);

        context.registerBean("user1",User.class,()->new User());
        User user1 = (User) context.getBean("user1");
        System.out.println(user1);
    }
}
