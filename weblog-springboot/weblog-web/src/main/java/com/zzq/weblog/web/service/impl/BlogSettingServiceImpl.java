package com.zzq.weblog.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzq.weblog.common.Response;
import com.zzq.weblog.common.domain.mapper.BlogSettingMapper;
import com.zzq.weblog.common.domain.dos.BlogSettingDO;
import com.zzq.weblog.web.convert.BlogSettingConvert;
import com.zzq.weblog.web.service.BlogSettingService;
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
public class BlogSettingServiceImpl extends ServiceImpl<BlogSettingMapper, BlogSettingDO> implements BlogSettingService {

    @Autowired
    private BlogSettingConvert blogSettingConvert;

    @Override
    public Response queryBlogSettingDetail() {
        BlogSettingDO blogSettingDO = getOne(null);
        return Response.success(blogSettingConvert.convert(blogSettingDO));
    }
}
