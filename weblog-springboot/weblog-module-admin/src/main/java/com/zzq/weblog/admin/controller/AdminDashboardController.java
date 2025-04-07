package com.zzq.weblog.admin.controller;

import com.zzq.weblog.admin.service.AdminDashboardService;
import com.zzq.weblog.common.Response;
import com.zzq.weblog.common.aspect.ApiOperationLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 张志强
 * @url: 
 * @date: 2023-04-19 16:06
 * @description: 后台首页 - 仪表盘
 **/
@RestController
@RequestMapping("/admin/dashboard")
public class AdminDashboardController {

    @Autowired
    private AdminDashboardService dashboardService;

    @PostMapping("/article/statistics")
    @ApiOperationLog(description = "获取后台仪表盘文章统计信息")
    public Response queryDashboardArticleStatisticsInfo() {
        return dashboardService.queryDashboardArticleStatisticsInfo();
    }

    @PostMapping("/publishArticle/statistics")
    @ApiOperationLog(description = "获取后台仪表盘文章发布 echat 统计信息")
    public Response queryDashboardPublishArticleStatisticsInfo() {
        return dashboardService.queryDashboardPublishArticleStatisticsInfo();
    }

    @PostMapping("/pv/statistics")
    @ApiOperationLog(description = "获取后台仪表盘 PV echat 统计信息")
    public Response queryDashboardPVStatisticsInfo() {
        return dashboardService.queryDashboardPVStatisticsInfo();
    }

}
