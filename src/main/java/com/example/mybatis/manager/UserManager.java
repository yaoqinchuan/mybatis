package com.example.mybatis.manager;

import com.example.mybatis.dto.UserDo;
import com.example.mybatis.model.UserModel;

import java.util.List;

public interface UserManager {
     List<UserModel> getAll();

     Long insertUserUseGeneratedKeys(UserModel userModel);

     Integer deleteByName(String name);

     Integer update(UserModel userModel);

     List<UserModel> queryByCondition(UserModel userModel);
}
