package com.example.mybatis.mapper;

import com.example.mybatis.dto.UserDo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<UserDo> getAll();

    Long insertUserUseGeneratedKeys(UserDo userDo);

    Integer deleteByName(String name);

    Integer update(UserDo userDo);

    List<UserDo> queryByCondition(UserDo userDo);
}
