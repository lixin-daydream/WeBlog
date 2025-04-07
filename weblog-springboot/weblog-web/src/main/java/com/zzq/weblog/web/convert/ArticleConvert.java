package com.zzq.weblog.web.convert;

import com.zzq.weblog.common.constant.Constants;
import com.zzq.weblog.common.domain.dos.ArticleDO;
import com.zzq.weblog.web.model.vo.archive.QueryArchiveItemRspVO;
import com.zzq.weblog.web.model.vo.article.QueryIndexArticlePageItemRspVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Date;
import java.util.Objects;

/**
 * @author: 张志强
 * @url: 
 * @date: 2023-07-30 8:55
 * @description: TODO
 **/
@Mapper(componentModel = "spring")
public interface ArticleConvert {
    ArticleConvert INSTANCE = Mappers.getMapper(ArticleConvert.class);

    @Mapping(target = "createTime", expression = "java(formatDate(bean.getCreateTime()))")
    QueryIndexArticlePageItemRspVO convert(ArticleDO bean);

    @Mapping(target = "createTime", expression = "java(formatDate(bean.getCreateTime()))")
    @Mapping(target = "createMonth", expression = "java(formatMonth(bean.getCreateTime()))")
    QueryArchiveItemRspVO convert2Archive(ArticleDO bean);

    default String formatDate(Date date) {
        if (Objects.isNull(date))
            return null;
        return Constants.DATE_FORMAT.format(date);
    }

    default String formatMonth(Date date) {
        if (Objects.isNull(date))
            return null;
        return Constants.MONTH_FORMAT.format(date);
    }

}
