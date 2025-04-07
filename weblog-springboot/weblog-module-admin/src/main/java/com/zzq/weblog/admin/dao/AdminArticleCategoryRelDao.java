package com.zzq.weblog.admin.dao;

import com.zzq.weblog.common.domain.dos.ArticleCategoryRelDO;

public interface AdminArticleCategoryRelDao {
    int insert(ArticleCategoryRelDO articleCategoryRelDO);

    ArticleCategoryRelDO selectByArticleId(Long articleId);

    int deleteByArticleId(Long articleId);
}
