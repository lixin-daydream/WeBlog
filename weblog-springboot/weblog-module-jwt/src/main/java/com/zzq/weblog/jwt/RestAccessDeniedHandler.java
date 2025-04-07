package com.zzq.weblog.jwt;

import com.zzq.weblog.common.Response;
import com.zzq.weblog.common.enums.ResponseCodeEnum;
import com.zzq.weblog.jwt.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: 张志强
 * @url: 
 * @date: 2023-04-18 9:23
 * @description: 登录成功后访问受保护的资源，但是权限不够
 **/
@Component
@Slf4j
public class RestAccessDeniedHandler implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        log.warn("", accessDeniedException);
        ResultUtil.ok(response, Response.fail(ResponseCodeEnum.FORBIDDEN));
    }
}
