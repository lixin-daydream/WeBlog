package com.zzq.weblog.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: 张志强
 * @url: 
 * @date: 2023-04-18 8:14
 * @description: 响应枚举
 **/
@Getter
@AllArgsConstructor
public enum EventEnum {

    // PV 加 1
    PV_INCREASE("PV INCREASE"),
    ;

    private String message;

}
