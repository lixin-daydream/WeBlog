package com.zzq.weblog.admin.service;


import com.zzq.weblog.common.Response;

public interface AdminDashboardService {

    Response queryDashboardArticleStatisticsInfo();

    Response queryDashboardPublishArticleStatisticsInfo();

    Response queryDashboardPVStatisticsInfo();
}
