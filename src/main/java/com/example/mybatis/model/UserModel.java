package com.example.mybatis.model;

import com.example.mybatis.dto.UserAddressDo;
import lombok.Data;

import java.util.List;

@Data
public class UserModel {
    private String name;
    private Long id;
    private String email;
    private String phone;
    private List<UserAddressDo> userAddresses;
}
