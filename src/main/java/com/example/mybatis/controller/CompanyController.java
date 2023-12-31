package com.example.mybatis.controller;


import com.example.mybatis.common.CommonResult;
import com.example.mybatis.model.CompanyModel;
import com.example.mybatis.service.impl.CompanyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/company")
public class CompanyController {

    @Autowired
    private CompanyServiceImpl companyServiceImpl;

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public CommonResult<CompanyModel> getById(@PathVariable Long id) {
        return CommonResult.success(companyServiceImpl.getById(id));
    }

}
