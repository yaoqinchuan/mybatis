package com.example.mybatis.validator;

import com.example.mybatis.eums.CommonResultCodeEnums;
import com.example.mybatis.exceptions.IllegalParameterException;
import com.example.mybatis.model.UserModel;

public class UserControllerValidator {
    public static void updateValidator(UserModel userModel) {
        if (null == userModel.getId() || userModel.getId() <= 0) {
            throw new IllegalParameterException(CommonResultCodeEnums.VALIDATION_EXCEPTION.getCode(), CommonResultCodeEnums.VALIDATION_EXCEPTION.getDescribe());
        }
    }
}
