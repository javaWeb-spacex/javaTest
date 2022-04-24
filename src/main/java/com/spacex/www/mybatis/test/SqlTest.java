package com.spacex.www.mybatis.test;

import com.spacex.www.mybatis.entity.User;
import com.spacex.www.mybatis.mapper.SqlMapper;
import com.spacex.www.mybatis.mapper.UserMapper;
import com.spacex.www.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @author :sbx
 * @date :2022/4/23 2:15
 * @description :
 * @version: :1.0.0
 */
public class SqlTest {

    @Test
    public void queryAllUsers() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper mapper = sqlSession.getMapper(SqlMapper.class);
        List<User> users = mapper.queryUserInfoByUserName("admi");
        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void deleteUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper mapper = sqlSession.getMapper(SqlMapper.class);
        int result = mapper.deleteUser("9,10,11");
        System.out.println("result:"+result);
    }

    @Test
    public void queryUSerByTableName() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper mapper = sqlSession.getMapper(SqlMapper.class);
        List<User> users = mapper.queryUSerByTableName("t_user");
        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void insertUserInfo() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper mapper = sqlSession.getMapper(SqlMapper.class);
        User user=new User(null,"李四","root",26,"男","353@qq.com");
        int result = mapper.insertUser(user);
        System.out.println("result:"+result);
        System.out.println(user);
    }
}
