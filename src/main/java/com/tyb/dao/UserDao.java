package com.tyb.dao;

import com.tyb.model.User;

public interface UserDao {
    /**
     * 添加新用户
     * @param user
     * @return
     */
    public int insertUser(User user);
}
