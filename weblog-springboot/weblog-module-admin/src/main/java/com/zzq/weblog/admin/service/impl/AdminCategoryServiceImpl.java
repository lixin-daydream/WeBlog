package com.zzq.weblog.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzq.weblog.admin.dao.AdminCategoryDao;
import com.zzq.weblog.common.domain.mapper.CategoryMapper;
import com.zzq.weblog.common.domain.dos.CategoryDO;
import com.zzq.weblog.admin.model.vo.category.AddCategoryReqVO;
import com.zzq.weblog.admin.model.vo.category.DeleteCategoryReqVO;
import com.zzq.weblog.admin.model.vo.category.QueryCategoryPageListReqVO;
import com.zzq.weblog.admin.model.vo.category.QueryCategoryPageListRspVO;
import com.zzq.weblog.admin.service.AdminCategoryService;
import com.zzq.weblog.common.PageResponse;
import com.zzq.weblog.common.Response;
import com.zzq.weblog.common.enums.ResponseCodeEnum;
import com.zzq.weblog.common.model.vo.QuerySelectListRspVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author: 张志强
 * @url: 
 * @date: 2023-04-17 12:08
 * @description: TODO
 **/
@Service
@Slf4j
public class AdminCategoryServiceImpl extends ServiceImpl<CategoryMapper, CategoryDO> implements AdminCategoryService {

    @Autowired
    private AdminCategoryDao categoryDao;

    @Override
    public Response addCategory(AddCategoryReqVO addCategoryReqVO) {
        String categoryName = addCategoryReqVO.getName();
        try {
            CategoryDO categoryDO = CategoryDO.builder()
                    .name(categoryName.trim())
                    .createTime(new Date())
                    .updateTime(new Date())
                    .build();
            save(categoryDO);
            return Response.success();
        } catch (DuplicateKeyException e) {
            log.error("==> 该分类已经存在：{}", categoryName, e);
            return Response.fail(ResponseCodeEnum.DUPLICATE_CATEGORY_ERROR);
        }

    }

    @Override
    public PageResponse queryCategoryPageList(QueryCategoryPageListReqVO queryCategoryPageListReqVO) {
        Long current = queryCategoryPageListReqVO.getCurrent();
        Long size = queryCategoryPageListReqVO.getSize();
        Page<CategoryDO> page = new Page<>(current, size);
        QueryWrapper<CategoryDO> wrapper = new QueryWrapper<>();

        String categoryName = queryCategoryPageListReqVO.getCategoryName();
        Date startDate = queryCategoryPageListReqVO.getStartDate();
        Date endDate = queryCategoryPageListReqVO.getEndDate();

        wrapper.lambda()
                .like(Objects.nonNull(categoryName), CategoryDO::getName, categoryName)
                .ge(Objects.nonNull(startDate), CategoryDO::getCreateTime, startDate)
                .le(Objects.nonNull(endDate), CategoryDO::getCreateTime, endDate)
                .orderByDesc(CategoryDO::getCreateTime);

        Page<CategoryDO> categoryDOPage = page(page, wrapper);

        List<CategoryDO> categoryDOS = categoryDOPage.getRecords();

        List<QueryCategoryPageListRspVO> queryCategoryPageListRspVOS = null;
        if (!CollectionUtils.isEmpty(categoryDOS)) {
            queryCategoryPageListRspVOS = categoryDOS.stream()
                    .map(p -> QueryCategoryPageListRspVO.builder()
                            .id(p.getId())
                            .name(p.getName())
                            .createTime(p.getCreateTime())
                            .build())
                    .collect(Collectors.toList());

        }

        return PageResponse.success(categoryDOPage, queryCategoryPageListRspVOS);
    }

    @Override
    public Response deleteCategory(DeleteCategoryReqVO deleteCategoryReqVO) {
        Long categoryId = deleteCategoryReqVO.getCategoryId();
        removeById(categoryId);
        return Response.success();
    }

    @Override
    public Response queryCategorySelectList() {
        List<CategoryDO> categoryDOList = categoryDao.selectAllCategory();
        List<QuerySelectListRspVO> list = null;
        if (!CollectionUtils.isEmpty(categoryDOList)) {
            list = categoryDOList.stream()
                    .map(p -> QuerySelectListRspVO.builder()
                            .label(p.getName())
                            .value(p.getId())
                            .build())
                    .collect(Collectors.toList());
        }
        return Response.success(list);
    }
}
