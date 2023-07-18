package com.example.mybatis.mapper;

import com.example.mybatis.dto.CompanyDo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CompanyMapper {
    CompanyDo getById(Long id);
}
