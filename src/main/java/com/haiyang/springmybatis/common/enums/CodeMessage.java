package com.haiyang.springmybatis.common.enums;

import com.haiyang.springmybatis.common.constant.UniversalConst;
import org.apache.logging.log4j.util.Strings;

/**
 * 消息提示对应的code,message
 * code:对应接口code
 * message:对应接口中message
 */
public enum CodeMessage {
    PARAM_FAIL(UniversalConst.CLIENT_PARAM_FAIL_CODE, UniversalConst.CLIENT_PARAM_FAIL_MESSAGE);
    private String code;
    private String message;

    CodeMessage(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 根据code获取指定的枚举类型
     * @param code
     * @return
     */
    public CodeMessage getEnumByCode(String code){
        if (Strings.isBlank(code)) {
            return null;
        }
        for (CodeMessage value : CodeMessage.values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
}
