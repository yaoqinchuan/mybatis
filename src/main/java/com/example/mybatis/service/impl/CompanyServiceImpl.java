package com.example.mybatis.service.impl;

import com.example.mybatis.manager.impl.CompanyManagerImpl;
import com.example.mybatis.model.CompanyModel;
import com.example.mybatis.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyManagerImpl companyManager;

    @Override
    public CompanyModel getById(Long id) {
        return companyManager.getById(id);
    }
}
