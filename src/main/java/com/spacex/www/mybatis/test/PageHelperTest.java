package com.spacex.www.mybatis.test;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.spacex.www.mybatis.entity.Emp;
import com.spacex.www.mybatis.mapper.EmpMapper;
import com.spacex.www.mybatis.mapper.PageHelperMapper;
import com.spacex.www.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author :sbx
 * @date :2022/4/26 11:08
 * @description :
 * @version: :1.0.0
 */
public class PageHelperTest {
    /**
     * limit index, pageSize
     * index :当前页的起使索引起使索引
     * pageSize : 每页显示的条数
     * pageNum: 当前页的页码
     * index=(pageNum-1)*pageSize
     */
    @Test
    public void queryAllEmp() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        PageHelperMapper mapper = sqlSession.getMapper(PageHelperMapper.class);
        Page<Object> page = PageHelper.startPage(2, 2);
        List<Emp> emps = mapper.queryAllEmp();
        emps.forEach(emp -> System.out.println(emp));

//        System.out.println("当前页："+page.getPageNum());
//        System.out.println("每页显示条数："+page.getPageSize());
//        System.out.println("总共页数："+page.getPages());
//        System.out.println("总条数："+page.getTotal());
        PageInfo<Emp> pageInfo = new PageInfo<>(emps,5);
        System.out.println("当前页："+pageInfo.getPageNum());
        System.out.println("每页显示条数："+pageInfo.getPageSize());
        System.out.println("总共页数："+pageInfo.getPages());
        System.out.println("总条数："+pageInfo.getTotal());
        System.out.println("是否是第一页："+pageInfo.isIsFirstPage());
        System.out.println("是否是最后一页："+pageInfo.isIsLastPage());
        System.out.println("有上一页："+pageInfo.isHasPreviousPage());
        System.out.println("有下一页："+pageInfo.isHasNextPage());
        System.out.println("中间显示的页码："+ Arrays.toString(pageInfo.getNavigatepageNums()));
        System.out.println(pageInfo.getList());
        System.out.println(pageInfo);
    }
}
