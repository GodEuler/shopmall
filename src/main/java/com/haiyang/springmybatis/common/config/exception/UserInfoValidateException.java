package com.haiyang.springmybatis.common.config.exception;

import com.haiyang.springmybatis.common.enums.CodeMessage;

/**
 * 用户身份验证信息错误
 */
public class UserInfoValidateException extends BaseException{

    public UserInfoValidateException(CodeMessage codeMessage) {
        super(codeMessage);
    }

    public UserInfoValidateException(String errorCode, String errorMessage) {

        super(errorCode, errorMessage);
    }
}
