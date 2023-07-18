package com.example.mybatis.manager;


import com.example.mybatis.model.CompanyModel;

public interface CompanyManager {
    CompanyModel getById(Long id);
}
