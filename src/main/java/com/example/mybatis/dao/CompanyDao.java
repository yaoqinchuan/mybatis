package com.example.mybatis.dao;

import com.example.mybatis.dto.CompanyDo;
import com.example.mybatis.mapper.CompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CompanyDao {
    @Autowired
    private CompanyMapper companyMapper;

    public CompanyDo getById(Long id) {
        CompanyDo result = companyMapper.getById(id);
        return result;
    }
}
