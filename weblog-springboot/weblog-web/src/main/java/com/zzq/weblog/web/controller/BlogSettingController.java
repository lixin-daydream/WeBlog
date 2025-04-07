package com.zzq.weblog.web.controller;

import com.zzq.weblog.common.Response;
import com.zzq.weblog.common.aspect.ApiOperationLog;
import com.zzq.weblog.web.service.BlogSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 张志强
 * @url: 
 * @date: 2023-04-18 8:14
 * @description: 博客设置
 **/
@RestController
@RequestMapping("/blog/setting")
public class BlogSettingController {

    @Autowired
    private BlogSettingService blogSettingService;

    @PostMapping("/detail")
    @ApiOperationLog(description = "获取右边栏博客详情信息")
    public Response queryBlogSettingDetail() {
        return blogSettingService.queryBlogSettingDetail();
    }

}
