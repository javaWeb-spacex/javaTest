package com.spacex.www.mybatis.mbg.mapper;

import com.spacex.www.mybatis.mbg.bean.Emp;

public interface EmpMapper {
    int deleteByPrimaryKey(Integer eid);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer eid);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}