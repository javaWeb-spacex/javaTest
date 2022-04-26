package com.spacex.www.mybatis.mapper;

import com.spacex.www.mybatis.entity.Emp;

import java.util.List;

/**
 * @author :sbx
 * @date :2022/4/26 11:08
 * @description :
 * @version: :1.0.0
 */
public interface PageHelperMapper {
    /**
     * 查询所有的员工信息
     */
    List<Emp> queryAllEmp();

}
