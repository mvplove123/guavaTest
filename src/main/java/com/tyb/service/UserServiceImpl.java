package com.tyb.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tyb.dao.UserDao;
import com.tyb.model.User;

@Service
public class UserServiceImpl implements UserService {
    
    @Resource
    private UserDao userDao;

    public void insertUser(User user) {
        // TODO Auto-generated method stub
        userDao.insertUser(user);
    }

}
