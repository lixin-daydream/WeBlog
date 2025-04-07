package com.zzq.weblog.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzq.weblog.common.Response;
import com.zzq.weblog.common.domain.dos.TagDO;


public interface TagService extends IService<TagDO> {
    Response queryTagList();
}
