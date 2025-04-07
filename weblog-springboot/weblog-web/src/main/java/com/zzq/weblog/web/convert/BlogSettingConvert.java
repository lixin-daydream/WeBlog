package com.zzq.weblog.web.convert;

import com.zzq.weblog.common.domain.dos.BlogSettingDO;
import com.zzq.weblog.web.model.vo.blogsetting.QueryBlogSettingRspVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author: 张志强
 * @url: 
 * @date: 2023-07-30 8:55
 * @description: TODO
 **/
@Mapper(componentModel = "spring")
public interface BlogSettingConvert {
    BlogSettingConvert INSTANCE = Mappers.getMapper(BlogSettingConvert.class);

    QueryBlogSettingRspVO convert(BlogSettingDO bean);


}
