package com.xsz.dao;

import com.xsz.entity.User;

import java.util.List;

public interface IUserDao {
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();
}
