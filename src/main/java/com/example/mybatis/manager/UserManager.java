package com.example.mybatis.manager;

import com.example.mybatis.dto.UserDo;
import com.example.mybatis.model.UserModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserManager {
     List<UserModel> getAll();

     Long insertUserUseGeneratedKeys(UserModel userModel);

     Integer deleteByName(String name);

     Integer update(UserModel userModel);

     List<UserModel> queryByCondition(UserModel userModel);

     List<UserModel> queryByPriorityCondition(UserModel userModel);

     Integer deleteByIds(List<Long> ids);

     Integer batchInsert( List<UserModel> userModels);
}
