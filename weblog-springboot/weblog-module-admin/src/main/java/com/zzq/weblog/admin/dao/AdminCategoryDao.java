package com.zzq.weblog.admin.dao;

import com.zzq.weblog.common.domain.dos.CategoryDO;

import java.util.List;

public interface AdminCategoryDao {
    List<CategoryDO> selectAllCategory();

    Long selectTotalCount();
}
