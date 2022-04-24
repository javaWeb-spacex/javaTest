package com.spacex.www.mybatis.mapper;

import com.spacex.www.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author :sbx
 * @date :2022/4/23 2:10
 * @description :
 * @version: :1.0.0
 */
public interface SqlMapper {
    /**
     * 根据用户姓名进行模糊查询
     */
    List<User> queryUserInfoByUserName(@Param("userName") String userName);

    /**
     * 批量删除
     */
    int deleteUser(@Param("ids") String ids);

    /**
     *查询指定表中的数据
     */
    List<User> queryUSerByTableName(@Param("tableName") String tableName);

    /**
     * 添加用户信息
     */
    int insertUser (User user);
}
