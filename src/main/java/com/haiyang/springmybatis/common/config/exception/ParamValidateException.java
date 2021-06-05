package com.haiyang.springmybatis.common.config.exception;

import com.haiyang.springmybatis.common.enums.CodeMessage;

/**
 * 参数验证错误
 */

public class ParamValidateException extends BaseException {
    public ParamValidateException(String errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }

    public ParamValidateException(CodeMessage codeMessage) {
        super(codeMessage);
    }
}
