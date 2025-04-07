package com.zzq.weblog.web.controller;

import com.zzq.weblog.common.PageResponse;
import com.zzq.weblog.common.Response;
import com.zzq.weblog.common.aspect.ApiOperationLog;
import com.zzq.weblog.web.model.vo.article.QueryCategoryArticlePageListReqVO;
import com.zzq.weblog.web.service.ArticleService;
import com.zzq.weblog.web.service.CategoryService;
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
 * @description: 分类
 **/
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ArticleService articleService;

    @PostMapping("/list")
    @ApiOperationLog(description = "获取所有分类数据")
    public Response queryCategoryList() {
        return categoryService.queryCategoryList();
    }

    @PostMapping("/article/list")
    @ApiOperationLog(description = "获取所属分类的文章分页数据")
    public PageResponse queryArticlePageList(@RequestBody @Validated QueryCategoryArticlePageListReqVO queryCategoryArticlePageListReqVO) {
        return articleService.queryCategoryArticlePageList(queryCategoryArticlePageListReqVO);
    }


}
