package com.haiyang.springmybatis.common.config.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import com.haiyang.springmybatis.common.response.FailResponse;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一错误处理机制
 */
@ControllerAdvice
@Slf4j
@ResponseBody
public class DealExceptionHandler {
    public static final String PARAM_NOT_VALIDATE_CODE  = "E500";


    @ExceptionHandler(ParamValidateException.class)
    FailResponse paramValidate(HttpServletRequest request,ParamValidateException exception){
        log.error("params is not permit:{}",exception.getErrorMessage());
        return dealWithException(request,exception);
    }

    @ExceptionHandler(value = UserInfoValidateException.class)
    FailResponse userInfoValidate(HttpServletRequest request, UserInfoValidateException exception){
        log.error("user information error:{} ",exception);
        return dealWithException(request,exception);
    }

    /**
     * validation 验证抛出的异常信息
     * @param request
     * @param exception
     * @return
     */
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    FailResponse validationNotPermit(HttpServletRequest request, MethodArgumentNotValidException exception){
        log.error("validation verify error message:{}",exception.getFieldError().getDefaultMessage());
        return  dealWithException(request,new  ParamValidateException(PARAM_NOT_VALIDATE_CODE,exception.getFieldError().getDefaultMessage()));
    }


    private FailResponse dealWithException(HttpServletRequest request,BaseException exception){
        beforeAction(request,exception);
        FailResponse failResponse = FailResponse.fail(exception.getErrorCode(), exception.getErrorMessage());
        afterAction(request,exception);
        return failResponse;
    }


    /**
     * 打印请求信息
     * @param request
     */
    private void printRequestInfo(HttpServletRequest request){

    }


    private void beforeAction(HttpServletRequest request,BaseException exception){
        printRequestInfo(request);
    }

    private void afterAction(HttpServletRequest request,BaseException exception){

    }

}
