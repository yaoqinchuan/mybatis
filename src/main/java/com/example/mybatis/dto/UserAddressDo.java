package com.example.mybatis.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserAddressDo {
    private Long id;
    private Long userId;
    private String zipCode;
    private String address;
    private Date gmtCreate;
    private Date gmtModified;
}
