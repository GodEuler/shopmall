package com.haiyang.springmybatis.common.response;

import java.util.Objects;

public class SmartResponse {

    public static final SuccessResponse SUCCESS_RESULT = SuccessResponse.success(null);

    public static final FailResponse FAIL_RESULT = FailResponse.fail();

    public static  BaseResponse result(Boolean result){
        return result?SUCCESS_RESULT:FAIL_RESULT;
    }

    public static<T> BaseResponse<T> result(T data ){
        if (Objects.nonNull(data)&&!(data instanceof Boolean)) {
            return SuccessResponse.success(data);
        }else{
            // TODO: 2021/6/5 当返回结果为空的时候返回什么数据，待思考...
            return SUCCESS_RESULT;
        }
    }

}
