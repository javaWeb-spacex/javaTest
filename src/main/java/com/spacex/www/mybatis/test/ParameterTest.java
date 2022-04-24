package com.spacex.www.mybatis.test;

import com.spacex.www.mybatis.entity.User;
import com.spacex.www.mybatis.mapper.UserMapper;
import com.spacex.www.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author :sbx
 * @date :2022/4/20 21:15
 * @description :
 * @version: :1.0.0
 */
public class ParameterTest {
    @Test
    public void queryUserInfoByUsername() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserInfoByUsername("张三");
        System.out.println(user);
    }

    @Test
    public void checkLogin() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLogin("张三", "123456");
        System.out.println(user);
    }

    @Test
    public void checkLoginByMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map=new HashMap<>();
        map.put("userName","张三");
        map.put("password","123456");
        User user = mapper.checkLoginByMap(map);
        System.out.println(user);
    }

    @Test
    public void insertUserInfo() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user=new User(null,"Lucy","root",18,"女","333@qq.com");
        int result = mapper.insertUserInfo(user);
        System.out.println("result:"+result);
    }

    @Test
    public void checkLoginByParam() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLoginByParam("张三", "123456");
        System.out.println(user);
    }

    @Test
    public void queryUserCount() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Integer result = mapper.queryUserCount();
        System.out.println("result:"+result);
    }

    @Test
    public void getUserInfoById() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> result = mapper.getUserInfoById(7);
        System.out.println(result);
    }

    @Test
    public void queryAllUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<Map<String, Object>> result = mapper.queryAllUser();
        result.forEach(map -> System.out.println(map));
    }

    @Test
    public void queryAllUsers() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> result = mapper.queryAllUsers();
        System.out.println(result);
    }

}
