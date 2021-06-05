package com.haiyang.springmybatis.common.utils;


import com.haiyang.springmybatis.common.enums.CodeMessage;
import com.haiyang.springmybatis.common.config.exception.ParamValidateException;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

public class SmartValidator {
    private Validator validator;

    public SmartValidator(Validator validator) {
        this.validator = validator;
    }


    public void doValidator(Object object, Class<?>... groups){
        Set<ConstraintViolation<Object>> validate = validator.validate(object, groups);
        for (ConstraintViolation<Object> constraintViolation : validate) {
            String message = constraintViolation.getMessage();
            throw new ParamValidateException(CodeMessage.PARAM_FAIL.getCode(),message);
        }
    }
}
