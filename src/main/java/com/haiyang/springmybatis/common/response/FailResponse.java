package com.haiyang.springmybatis.common.response;

/**
 *
 * @param <T>
 */
public class FailResponse<T> extends BaseResponse {
    public static final String DEFAULT_ERROR_CODE  = "E200";
    public static final String DEFAULT_ERROR_MSG = "error , try again ~";


    public FailResponse(Boolean success, String message, String code, Object data) {
        super(success, message, code, data);
    }

    public static<T> FailResponse fail(String code,String message,T data){
        return new FailResponse<T>(false, message, code, data);
    }

    public static<T> FailResponse fail(String code,String message){
        return new FailResponse<T>(false, message, code, null);
    }

    public static<T> FailResponse fail(){
        return new FailResponse<T>(false, DEFAULT_ERROR_MSG, DEFAULT_ERROR_CODE, null);
    }

}
