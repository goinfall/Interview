package com.example.dao;

import com.example.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (user)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-01 15:17:59
 */
public interface UserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    User queryById(Long id);

    int insert(User user);

    int update(User user);

    int deleteByIds(@Param("ids") List<Long> ids);

}