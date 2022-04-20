package com.spacex.www.mybatis.test;

import com.spacex.www.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author :sbx
 * @date :2022/4/19 13:04
 * @description :
 * @version: :1.0.0
 */
public class UpdateTest {

    public static void main(String[] args) throws IOException {
        //加载核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
        //获取SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        //获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        /**
         * 获取SqlSession对象，并设置事务为自动提交
         * SqlSession默认不自动提交事务
         * 如果需要自动提交事务，可以使用sqlSessionFactory.openSession(true);
         */
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取mapper接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //测试功能
        int result = mapper.updateUserInfo();
        System.out.println("result:"+result);
    }
}
