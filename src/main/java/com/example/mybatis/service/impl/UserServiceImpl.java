package com.example.mybatis.service.impl;

import com.example.mybatis.manager.impl.UserManagerImpl;
import com.example.mybatis.model.UserModel;
import com.example.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserManagerImpl userManagerImpl;

    @Override
    public List<UserModel> getAll() {
        return userManagerImpl.getAll();
    }

    @Override
    public Long insertUserUseGeneratedKeys(UserModel userModel) {
        return userManagerImpl.insertUserUseGeneratedKeys(userModel);
    }

    @Override
    public Integer deleteByName(String name) {
        return userManagerImpl.deleteByName(name);
    }

    @Override
    public Integer update(UserModel userModel) {
        return userManagerImpl.update(userModel);
    }

    @Override
    public List<UserModel> queryByCondition(UserModel userModel) {
        return userManagerImpl.queryByCondition(userModel);
    }
}
