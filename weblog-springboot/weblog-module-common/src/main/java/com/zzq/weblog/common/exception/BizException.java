package com.zzq.weblog.common.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: 张志强
 * @url: 
 * @date: 2023-04-18 8:03
 * @description: 业务异常
 **/
@Getter
@Setter
public class BizException extends RuntimeException {
    // 错误码
    private String errorCode;
    // 错误信息
    private String errorMessage;

    public BizException(BaseExceptionInterface exception) {
        this.errorCode = exception.getErrorCode();
        this.errorMessage = exception.getErrorMessage();
    }

}
