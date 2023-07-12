package com.example.mybatis.dao;

import com.example.mybatis.dto.UserDo;
import com.example.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDao {
    @Autowired
    private UserMapper userMapper;

    public List<UserDo> getAll() {
        List<UserDo> result = userMapper.getAll();
        return result;
    }

    public Long insertUserUseGeneratedKeys(UserDo userDo) {
        userMapper.insertUserUseGeneratedKeys(userDo);
        return userDo.getId();
    }

    public Integer deleteByName(String name) {
        return userMapper.deleteByName(name);
    }


    public Integer update(UserDo userDo) {
        return userMapper.update(userDo);
    }

    public List<UserDo> queryByCondition(UserDo userDo) {
        return userMapper.queryByCondition(userDo);
    }
}
