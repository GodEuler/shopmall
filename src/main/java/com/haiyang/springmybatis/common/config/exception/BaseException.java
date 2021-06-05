package com.haiyang.springmybatis.common.config.exception;

import com.haiyang.springmybatis.common.enums.CodeMessage;
import lombok.Data;

@Data
public class BaseException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    protected String errorCode;
    protected String errorMessage;

    protected CodeMessage codeMessage;

    public BaseException(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public BaseException(CodeMessage codeMessage) {
        this.codeMessage = codeMessage;
        this.errorCode = codeMessage.getCode();
        this.errorMessage = codeMessage.getMessage();
    }
}

