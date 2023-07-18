package com.example.mybatis.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class CompanyDo {
    private Long id;
    private String name;
    private Date createTime;
    private Long workerCount;
    private List<UserDo> userList;
    private Date gmtCreate;
    private Date gmtModified;
}
