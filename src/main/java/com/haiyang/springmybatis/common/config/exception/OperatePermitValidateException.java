package com.haiyang.springmybatis.common.config.exception;

import com.haiyang.springmybatis.common.enums.CodeMessage;

/**
 * 用户操作权限验证
 */
public class OperatePermitValidateException extends BaseException{
    public OperatePermitValidateException(String errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }

    public OperatePermitValidateException(CodeMessage codeMessage) {
        super(codeMessage);
    }
}
