package com.spacex.www.mybatis.test;

import com.spacex.www.mybatis.entity.Dept;
import com.spacex.www.mybatis.entity.Emp;
import com.spacex.www.mybatis.mapper.DeptMapper;
import com.spacex.www.mybatis.mapper.EmpMapper;
import com.spacex.www.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author :sbx
 * @date :2022/4/24 22:19
 * @description :
 * @version: :1.0.0
 */
public class EmpAndDeptTest {

    @Test
    public void queryUSerByTableName() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> emps = mapper.queryAllEmp();
        emps.forEach(emp -> System.out.println(emp));
    }

    @Test
    public void queryEmpAndDept() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.queryEmpAndDept(4);
        System.out.println(emp);
    }

    @Test
    public void queryEmpAndDeptByStep() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.queryEmpAndDeptByStepOne(5);
        System.out.println(emp.getEmpName());
        System.out.println("-----------------------------------------");
        System.out.println(emp.getDept().getDeptName());
    }


    @Test
    public void getDeptAndEmp() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmp(2);
        System.out.println(dept);
    }

    @Test
    public void queryDeptAndEmpByStepOne() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.queryDeptAndEmpByStepOne(1);
        System.out.println(dept.getDeptName());
        System.out.println("-----------------------------------------");
        System.out.println(dept.getEmps().get(1).getEmpName());
        System.out.println(dept);
    }
}
