package com.tyb.dao;

import org.springframework.stereotype.Repository;

import com.tyb.model.User;

@Repository
public class UserDaoImpl implements UserDao {

    public int insertUser(User user) {
        // TODO Auto-generated method stub
        
        System.out.println("dao ok");
        return 0;
    }

}
