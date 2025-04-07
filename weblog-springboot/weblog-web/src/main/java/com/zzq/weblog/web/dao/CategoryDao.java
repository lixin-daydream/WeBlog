package com.zzq.weblog.web.dao;

import com.zzq.weblog.common.domain.dos.CategoryDO;

import java.util.List;

public interface CategoryDao {
    List<CategoryDO> selectAllCategory();

    CategoryDO selectByCategoryId(Long categoryId);
}
