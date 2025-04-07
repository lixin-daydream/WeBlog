package com.zzq.weblog.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzq.weblog.common.Response;
import com.zzq.weblog.common.domain.dos.CategoryDO;


public interface CategoryService extends IService<CategoryDO> {
    Response queryCategoryList();

}
