package com.spacex.www.mybatis.mapper;

import com.spacex.www.mybatis.entity.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @author :sbx
 * @date :2022/4/25 22:05
 * @description :
 * @version: :1.0.0
 */
public interface CacheMapper {
    /**
     * 根据Id查询员工信息
     */
    Emp queryEmpInofById(@Param("eid")Integer eid);
}
