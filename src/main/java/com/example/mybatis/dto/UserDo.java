package com.example.mybatis.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserDo {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private UserAddressDo userAddress;
    private Date gmtCreate;
    private Date gmtModified;
}
