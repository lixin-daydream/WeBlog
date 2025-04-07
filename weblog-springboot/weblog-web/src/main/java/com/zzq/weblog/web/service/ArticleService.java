package com.zzq.weblog.web.service;

import com.zzq.weblog.common.PageResponse;
import com.zzq.weblog.common.Response;
import com.zzq.weblog.web.model.vo.article.QueryArticleDetailReqVO;
import com.zzq.weblog.web.model.vo.article.QueryCategoryArticlePageListReqVO;
import com.zzq.weblog.web.model.vo.article.QueryIndexArticlePageListReqVO;
import com.zzq.weblog.web.model.vo.article.QueryTagArticlePageListReqVO;


public interface ArticleService {

    PageResponse queryIndexArticlePageList(QueryIndexArticlePageListReqVO queryIndexArticlePageListReqVO);

    PageResponse queryCategoryArticlePageList(QueryCategoryArticlePageListReqVO queryCategoryArticlePageListReqVO);

    Response queryArticleDetail(QueryArticleDetailReqVO queryArticleDetailReqVO);

    PageResponse queryTagArticlePageList(QueryTagArticlePageListReqVO queryTagArticlePageListReqVO);

}
