package com.example.service;

import com.example.entity.User;

import java.util.List;

/**
 * user表业务逻辑层
 *
 * @author 孙忠忠
 * @since 2022-02-20 16:23:11
 */
public interface UserService {

    User insert(User user);

    User queryOne(Long id);

    User update(User user);

    boolean delete(List<Long> ids);


}
