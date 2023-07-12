package com.example.mybatis.service;

import com.example.mybatis.model.UserModel;

import java.util.List;

public interface UserService {
    List<UserModel> getAll();

    Long insertUserUseGeneratedKeys(UserModel userModel);

    Integer deleteByName(String name);

    Integer update(UserModel userModel);

    List<UserModel> queryByCondition(UserModel userModel);
}
