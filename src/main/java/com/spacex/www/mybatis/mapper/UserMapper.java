package com.spacex.www.mybatis.mapper;



import com.spacex.www.mybatis.entity.User;

import java.util.List;

/**
 * @author :sbx
 * @date :2022/4/19 12:36
 * @description :
 * @version: :1.0.0
 */
public interface UserMapper {


    /**
     * Mybatis 面向接口编程的两个一致：
     * 1、映射文件的namespace要和mapper接口的全限定类名保持一致
     * 2、映射文件中sql语句的id要和mapper接口中的方法名称保持一致
     */

    /**
     * 添加用户信息
     */
    int insertUser();

    /**
     * 修改用户信息
     */
    int updateUserInfo();

    /**
     * 删除用户信息
     */
    int deleteUserInfoById();

    /**
     * 查询所有用户信息
     */
    List<User> queryAllUserInfo();
    /**
     * 查询用户信息
     */
    User queryUserInfoById();
}
