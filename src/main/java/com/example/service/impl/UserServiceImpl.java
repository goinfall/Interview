package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * user表业务逻辑层
 *
 * @author 孙忠忠
 * @since 2022-02-20 16:23:11
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User insert(User user){
         this.userDao.insert(user);
         return user;
    }

    @Override
    public User queryOne(Long id){
        return userDao.queryById(id);
    }

    @Override
    public User update(User user){
        this.userDao.update(user);
        return this.userDao.queryById(user.getId());
    }
    @Override
    public boolean delete(List<Long> ids){
        return this.userDao.deleteByIds(ids)>0;
    }


}
