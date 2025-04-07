package com.zzq.weblog.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzq.weblog.admin.model.vo.blogsetting.UpdateBlogSettingReqVO;
import com.zzq.weblog.admin.model.vo.user.QueryUserDetailRspVO;
import com.zzq.weblog.common.Response;
import com.zzq.weblog.common.domain.dos.BlogSettingDO;


public interface AdminBlogSettingService extends IService<BlogSettingDO> {

    Response updateBlogSetting(UpdateBlogSettingReqVO updateBlogSettingReqVO);

    Response queryBlogSettingDetail();

    Response<QueryUserDetailRspVO> queryNicknameAndAvatar();
}
