package com.zzq.weblog.web.controller;

import com.zzq.weblog.common.Response;
import com.zzq.weblog.common.aspect.ApiOperationLog;
import com.zzq.weblog.web.model.vo.article.QueryArticleDetailReqVO;
import com.zzq.weblog.web.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 张志强
 * @url: 
 * @date: 2023-04-18 8:14
 * @description: 文章
 **/
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping("/detail")
    @ApiOperationLog(description = "获取文章详情信息")
    public Response queryArticleDetail(@RequestBody @Validated QueryArticleDetailReqVO queryArticleDetailReqVO) {
        return articleService.queryArticleDetail(queryArticleDetailReqVO);
    }
}
