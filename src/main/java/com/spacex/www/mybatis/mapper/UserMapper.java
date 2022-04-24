package com.spacex.www.mybatis.mapper;



import com.spacex.www.mybatis.entity.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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

    /**
     * 根据用户名称查询用户信息
     */
    User queryUserInfoByUsername(String userName);

    /**
     * 验证登录
     */
    User checkLogin(String userName, String password);

    /**
     * 验证登录(参数为map)
     */
    User checkLoginByMap(Map<String, Object> map);

    /**
     * 添加用户信息
     */
    int insertUserInfo(User user);

    /**
     * 验证登录(使用@Param注解)
     */
    User checkLoginByParam(@Param("userName") String userName, @Param("password") String password);

    /**
     * 查询用户总人数
     */
    int queryUserCount();

    /**
     * 根据用户id查询用户信息
     * @param id
     * @return
     */
    Map<String, Object> getUserInfoById(@Param("id") Integer id);

    /**
     * 查询所有用户信息为map集合
     */
    List<Map<String, Object>> queryAllUser();

    /**
     * 查询所有用户信息为map集合
     */
    @MapKey("id")
    Map<String, Object> queryAllUsers();

}

