package com.zzq.weblog.web.controller;

import com.zzq.weblog.common.Response;
import com.zzq.weblog.common.aspect.ApiOperationLog;
import com.zzq.weblog.web.model.vo.archive.QueryArchivePageListReqVO;
import com.zzq.weblog.web.service.ArchiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 张志强
 * @url: 
 * @date: 2023-04-18 8:14
 * @description: 归档
 **/
@RestController
@RequestMapping("/archive")
public class ArchiveController {

    @Autowired
    private ArchiveService archiveService;

    @PostMapping("/list")
    @ApiOperationLog(description = "获取文章归档列表")
    public Response queryArchive(@RequestBody QueryArchivePageListReqVO queryArchivePageListReqVO) {
        return archiveService.queryArchive(queryArchivePageListReqVO);
    }

}
