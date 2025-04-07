package com.zzq.weblog.admin.controller;

import com.zzq.weblog.admin.model.vo.blogsetting.UpdateBlogSettingReqVO;
import com.zzq.weblog.admin.service.AdminBlogSettingService;
import com.zzq.weblog.common.Response;
import com.zzq.weblog.common.aspect.ApiOperationLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 张志强
 * @url: 
 * @date: 2023-04-19 16:06
 * @description: TODO
 **/
@RestController
@RequestMapping("/admin/blog/setting")
public class AdminBlogSettingController {

    @Autowired
    private AdminBlogSettingService blogSettingService;

    @PostMapping("/update")
    @ApiOperationLog(description = "更新博客设置信息")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Response updateBlogSetting(@RequestBody @Validated UpdateBlogSettingReqVO updateBlogSettingReqVO) {
        return blogSettingService.updateBlogSetting(updateBlogSettingReqVO);
    }

    @PostMapping("/detail")
    @ApiOperationLog(description = "获取博客设置详情信息")
    public Response queryBlogSettingDetail() {
        return blogSettingService.queryBlogSettingDetail();
    }
}
