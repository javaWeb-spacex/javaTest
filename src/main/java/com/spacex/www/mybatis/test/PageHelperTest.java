package com.spacex.www.mybatis.test;

import com.spacex.www.mybatis.entity.Emp;
import com.spacex.www.mybatis.mapper.EmpMapper;
import com.spacex.www.mybatis.mapper.PageHelperMapper;
import com.spacex.www.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author :sbx
 * @date :2022/4/26 11:08
 * @description :
 * @version: :1.0.0
 */
public class PageHelperTest {
    @Test
    public void queryAllEmp() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        PageHelperMapper mapper = sqlSession.getMapper(PageHelperMapper.class);
        List<Emp> emps = mapper.queryAllEmp();
        emps.forEach(emp -> System.out.println(emp));
    }
}
