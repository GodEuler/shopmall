package com.haiyang.springmybatis.common.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 返回数据
 */
@Data
@AllArgsConstructor
public class BaseResponse<T> {
    private Boolean ok;
    private String message;
    private String code;
    private T data;
}
