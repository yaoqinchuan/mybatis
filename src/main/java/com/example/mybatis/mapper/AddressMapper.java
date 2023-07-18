package com.example.mybatis.mapper;

import com.example.mybatis.dto.UserAddressDo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AddressMapper {
    UserAddressDo getById(Long id);
}
