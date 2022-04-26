package com.spacex.www.mybatis.mapper;

import com.spacex.www.mybatis.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author :sbx
 * @date :2022/4/25 11:28
 * @description :
 * @version: :1.0.0
 */
public interface DynamicSqlMapper {
    /**
     * 多条件查询
     */

    List<Emp> getEmpByCondition(Emp emp);

    /**
     * 多条件查询-where
     */

    List<Emp> getEmpByConditionTwo(Emp emp);

    /**
     * 多条件查询-trim
     */

    List<Emp> getEmpByConditionThree(Emp emp);

    /**
     * 多条件查询-choose、when、otherwise相当于if-else if-else
     */
    List<Emp> getEmpByConditionFour(Emp emp);

    /**
     * 通过数组实现批量删除
     */
    int deleteMoreByArray(@Param("eids") int[] eids);

    /**
     * 通过list实现批量添加功能
     */
    int insertMoreByList(@Param("emps") List<Emp> emps);

    /**
     * 查询所有员工信息
     */
    List<Emp> queryAllEmp();

}

