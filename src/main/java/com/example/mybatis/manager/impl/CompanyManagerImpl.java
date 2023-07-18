package com.example.mybatis.manager.impl;

import com.example.mybatis.common.ConvertUtils;
import com.example.mybatis.dao.CompanyDao;
import com.example.mybatis.dto.CompanyDo;
import com.example.mybatis.manager.CompanyManager;
import com.example.mybatis.model.CompanyModel;
import com.example.mybatis.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;


@Component
public class CompanyManagerImpl implements CompanyManager {
    @Autowired
    private CompanyDao companyDao;

    @Override
    public CompanyModel getById(Long id) {
        CompanyDo companyDo = companyDao.getById(id);
        CompanyModel companyModel = ConvertUtils.convert(companyDo, CompanyModel.class);
        companyModel.setUserList(companyDo.getUserList().stream().map(user-> ConvertUtils.convert(user, UserModel.class)).collect(Collectors.toList()));
        return companyModel;
    }
}
