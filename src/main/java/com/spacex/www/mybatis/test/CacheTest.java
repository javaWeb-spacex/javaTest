package com.spacex.www.mybatis.test;

import com.spacex.www.mybatis.entity.Emp;
import com.spacex.www.mybatis.mapper.CacheMapper;
import com.spacex.www.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author :sbx
 * @date :2022/4/25 22:38
 * @description :
 * @version: :1.0.0
 */
public class CacheTest {

    @Test
    public void queryEmpInofById() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp emp = mapper.queryEmpInofById(1);
        System.out.println(emp);
        //清空缓存
//        sqlSession.clearCache();
        //获取另一个SqlSession对象
//        SqlSession sqlSession2 = SqlSessionUtils.getSqlSession();
        CacheMapper mapper2 = sqlSession.getMapper(CacheMapper.class);
        Emp emp2 = mapper2.queryEmpInofById(1);
        System.out.println(emp2);
    }

    @Test
    public void queryEmpInofById2() throws IOException {
        //加载核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
        //获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp emp = mapper.queryEmpInofById(1);
        System.out.println(emp);
        sqlSession.close();

        SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        Emp emp2 = mapper2.queryEmpInofById(1);
        System.out.println(emp2);
    }


}
