package com.haiyang.springmybatis.common.constant;

/**
 * 通用常量定义
 */
public class UniversalConst {

    //客户端入参校验失败
    public static final String CLIENT_PARAM_FAIL_CODE = "E500";
    public static final String CLIENT_PARAM_FAIL_MESSAGE = "入参校验失败";

    //系统内部进行参数校验失败
    public static final String INNER_SYSTEM_PARAM_FAIL_CODE = "E600";
    public static final String INNER_SYSTEM_PARAM_FAIL_MESSAGE = "内部参数校验失败";

    //用户信息有误（用户不存在|用户token不匹配|用户进入黑名单...）
    public static final String USER_INFORMATION_ERROR_CODE = "E400";
    public static final String USER_INFORMATION_ERROR_MESSAGE = "用户信息有误";

    //当前用户访问权限受限制
    public static final String DENY_ACCESS_FOR_USER_CODE = "E300";
    public static final String DENY_ACCESS_FOR_USER_MESSAGE = "前用户访问权限受限制";
}
