package com.example.dao;

import com.example.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * user dao层
 *
 * @author 孙忠忠
 * @since 2022-02-20 16:25:34
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