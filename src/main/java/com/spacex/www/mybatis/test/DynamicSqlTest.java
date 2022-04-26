package com.spacex.www.mybatis.test;

import com.spacex.www.mybatis.entity.Emp;
import com.spacex.www.mybatis.mapper.DynamicSqlMapper;
import com.spacex.www.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :sbx
 * @date :2022/4/25 11:35
 * @description :
 * @version: :1.0.0
 */
public class DynamicSqlTest {

    @Test
    public void getEmpByCondition() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        List<Emp> empByCondition = mapper.getEmpByCondition(new Emp(null, "", 56, "男", "123@qq.com", null));
        empByCondition.forEach(emp -> System.out.println(emp));
    }

    @Test
    public void getEmpByConditionTwo() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        List<Emp> empByCondition = mapper.getEmpByConditionTwo(new Emp(null, "", 56, "男", "123@qq.com", null));
        empByCondition.forEach(emp -> System.out.println(emp));
    }

    @Test
    public void getEmpByConditionThree() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        List<Emp> empByCondition = mapper.getEmpByConditionThree(new Emp(null, "", 56, "男", "123@qq.com", null));
        empByCondition.forEach(emp -> System.out.println(emp));
    }


    @Test
    public void getEmpByConditionFour() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        List<Emp> empByCondition = mapper.getEmpByConditionFour(new Emp(null, "", null, "", "", null));
        empByCondition.forEach(emp -> System.out.println(emp));
    }

    @Test
    public void deleteMoreByArray() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        int result = mapper.deleteMoreByArray(new int[]{6,7,8,9});
        System.out.println(result);
    }

    @Test
    public void insertMoreByList() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        ArrayList<Emp> emps = new ArrayList<>();
        emps.add(new Emp(6,"a1",17,"男","777@qq.com",null));
        emps.add(new Emp(7,"a2",18,"男","777@qq.com",null));
        emps.add(new Emp(8,"a3",19,"男","777@qq.com",null));
        emps.add(new Emp(9,"a4",20,"男","777@qq.com",null));
        int result = mapper.insertMoreByList(emps);
        System.out.println(result);
    }

    @Test
    public void queryAllEmp() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        List<Emp> empByCondition = mapper.queryAllEmp();
        empByCondition.forEach(emp -> System.out.println(emp));
    }

}
