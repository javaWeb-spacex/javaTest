package com.spacex.www.mybatis.mapper;

import com.spacex.www.mybatis.entity.Dept;
import com.spacex.www.mybatis.entity.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @author :sbx
 * @date :2022/4/24 10:55
 * @description :
 * @version: :1.0.0
 */
public interface DeptMapper {

    /**
     * 通过分步查询员工以及员工所对应的部门信息
     * 2、通过did查询员工所对应的部门信息
     */
    Dept queryEmpAndDeptByStepTwo(@Param("did")Integer did);

    /**
     * 获取部门以及部门中所有的员工信息
     */
    Dept getDeptAndEmp(@Param("did")Integer did);

    /**
     * 通过分步查询查询部门信息以及部门下所对应的员工信息
     * 1、通过did查询部门信息
     */
    Dept queryDeptAndEmpByStepOne(@Param("did")Integer did);
}
