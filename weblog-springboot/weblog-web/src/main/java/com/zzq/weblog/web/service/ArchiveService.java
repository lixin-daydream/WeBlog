package com.zzq.weblog.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzq.weblog.common.Response;
import com.zzq.weblog.common.domain.dos.ArticleDO;
import com.zzq.weblog.web.model.vo.archive.QueryArchivePageListReqVO;


public interface ArchiveService extends IService<ArticleDO> {

    Response queryArchive(QueryArchivePageListReqVO queryArchivePageListReqVO);
}
