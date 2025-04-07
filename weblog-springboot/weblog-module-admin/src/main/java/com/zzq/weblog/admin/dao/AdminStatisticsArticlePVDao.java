package com.zzq.weblog.admin.dao;

import com.zzq.weblog.common.domain.dos.StatisticsArticlePVDO;

import java.util.Date;
import java.util.List;

public interface AdminStatisticsArticlePVDao {
    void pvIncrease(Date currDate);

    List<StatisticsArticlePVDO> selectLatestWeekRecords();

    List<StatisticsArticlePVDO> selectAllPVCount();
}
