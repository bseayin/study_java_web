package com.xsz.mapper;

import com.xsz.model.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
    User selectByNameAndPwd(User record);
}