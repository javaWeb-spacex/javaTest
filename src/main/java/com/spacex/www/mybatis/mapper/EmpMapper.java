package com.spacex.www.mybatis.mapper;

import com.spacex.www.mybatis.entity.Dept;
import com.spacex.www.mybatis.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author :sbx
 * @date :2022/4/24 10:55
 * @description :
 * @version: :1.0.0
 */
public interface EmpMapper {
    /**
     * 查询所有的员工信息
     */
    List<Emp> queryAllEmp();

    /**
     * 查询员工以及员工所对应的部门信息
     */
    Emp queryEmpAndDept(@Param("eid")Integer eid);

    /**
     * 通过分步查询员工以及员工所对应的部门信息
     * 1、查询员工信息
     */
    Emp queryEmpAndDeptByStepOne(@Param("eid")Integer eid);

    /**
     * 通过分步查询查询部门信息以及部门下所对应的员工信息
     * 2、通过did查询部门下使用员工的信息
     */
    List<Emp> queryDeptAndEmpByStepTwo(@Param("did")Integer did);
}
