package com.zzq.weblog.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzq.weblog.common.domain.dos.CategoryDO;
import com.zzq.weblog.admin.model.vo.category.AddCategoryReqVO;
import com.zzq.weblog.admin.model.vo.category.DeleteCategoryReqVO;
import com.zzq.weblog.admin.model.vo.category.QueryCategoryPageListReqVO;
import com.zzq.weblog.common.PageResponse;
import com.zzq.weblog.common.Response;


public interface AdminCategoryService extends IService<CategoryDO> {
    Response addCategory(AddCategoryReqVO addCategoryReqVO);

    PageResponse queryCategoryPageList(QueryCategoryPageListReqVO queryCategoryPageListReqVO);

    Response deleteCategory(DeleteCategoryReqVO deleteCategoryReqVO);

    Response queryCategorySelectList();
}
