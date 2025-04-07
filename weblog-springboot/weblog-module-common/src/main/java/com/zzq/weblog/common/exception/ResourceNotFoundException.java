package com.zzq.weblog.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author: 张志强
 * @url: 
 * @date: 2023-04-18 8:24
 * @description: 资源不存在
 **/
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException() {
        super("The resource not found.");
    }

}
