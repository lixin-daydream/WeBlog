package com.zzq.weblog.web.dao;

import com.zzq.weblog.common.domain.dos.ArticleContentDO;

public interface ArticleContentDao {
    ArticleContentDO selectArticleContentByArticleId(Long articleId);
}
