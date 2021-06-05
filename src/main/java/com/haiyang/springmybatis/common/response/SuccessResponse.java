package com.haiyang.springmybatis.common.response;

import lombok.Data;

/**
 *
 * @param <T>
 */
@Data
public class SuccessResponse<T> extends BaseResponse {

    private static final String SUCCESS_CODE = "200";
    private static final String DEFAULT_SUCCESS_MSG="success";

    public SuccessResponse(Boolean success, String message, String code, Object data) {
        super(success, message, code, data);
    }

    public static<T> SuccessResponse success(T data){
        return new SuccessResponse<T>(true, DEFAULT_SUCCESS_MSG, SUCCESS_CODE, data);
    }

    public static<T> SuccessResponse success(String message,T data){
        return new SuccessResponse<T>(true, message, SUCCESS_CODE, data);
    }

}
