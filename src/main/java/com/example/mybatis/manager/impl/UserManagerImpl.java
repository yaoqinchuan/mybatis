package com.example.mybatis.manager.impl;

import com.example.mybatis.common.ConvertUtils;
import com.example.mybatis.dao.UserDao;
import com.example.mybatis.dto.UserDo;
import com.example.mybatis.manager.UserManager;
import com.example.mybatis.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserManagerImpl implements UserManager {
    @Autowired
    private UserDao userDao;

    @Override
    public List<UserModel> getAll() {
        return userDao.getAll().stream().map(userDo -> ConvertUtils.convert(userDo, UserModel.class)).collect(Collectors.toList());
    }

    @Override
    public Long insertUserUseGeneratedKeys(UserModel userModel) {
        return userDao.insertUserUseGeneratedKeys(ConvertUtils.convert(userModel, UserDo.class));
    }

    @Override
    public Integer deleteByName(String name) {
        return userDao.deleteByName(name);
    }

    @Override
    public Integer update(UserModel userModel) {
        return userDao.update(ConvertUtils.convert(userModel, UserDo.class));
    }

    @Override
    public List<UserModel> queryByCondition(UserModel userModel) {
        return userDao.queryByCondition(ConvertUtils.convert(userModel, UserDo.class)).stream().map(userDo -> ConvertUtils.convert(userDo, UserModel.class)).collect(Collectors.toList());
    }
}
