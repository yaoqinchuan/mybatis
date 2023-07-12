package com.example.mybatis.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class UserDo {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private List<UserAddressDo> userAddresses;
    private Date gmtCreate;
    private Date gmtModified;
}
