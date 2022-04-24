package com.spacex.www.mybatis.test;

import com.spacex.www.mybatis.entity.User;
import com.spacex.www.mybatis.mapper.UserMapper;

import com.spacex.www.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author :sbx
 * @date :2022/4/19 13:04
 * @description :
 * @version: :1.0.0
 */
public class SelectTest {

    public static void main(String[] args) throws IOException {

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        //获取mapper接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //测试功能
        User user = mapper.queryUserInfoById();
        System.out.println(user.toString());
        System.out.println("-------------------------------------------------------");
        List<User> users = mapper.queryAllUserInfo();
       users.forEach(user1 -> System.out.println(user));
    }
}
