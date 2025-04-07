package com.zzq.weblog.web.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zzq.weblog.common.domain.mapper.ArticleContentMapper;
import com.zzq.weblog.common.domain.dos.ArticleContentDO;
import com.zzq.weblog.web.dao.ArticleContentDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: 张志强
 * @url: 
 * @date: 2023-04-17 12:08
 * @description: TODO
 **/
@Service
@Slf4j
public class ArticleContentDaoImpl implements ArticleContentDao {
    @Autowired
    private ArticleContentMapper articleContentMapper;

    @Override
    public ArticleContentDO selectArticleContentByArticleId(Long articleId) {
        QueryWrapper<ArticleContentDO> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(ArticleContentDO::getArticleId, articleId);
        return articleContentMapper.selectOne(wrapper);
    }
}
