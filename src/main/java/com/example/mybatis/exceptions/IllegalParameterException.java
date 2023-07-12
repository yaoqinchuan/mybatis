package com.example.mybatis.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IllegalParameterException extends RuntimeException{
    private String message;
    private String code;
}
