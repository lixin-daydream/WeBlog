package com.zzq.weblog.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzq.weblog.admin.model.vo.user.UpdateAdminPasswordReqVO;
import com.zzq.weblog.common.Response;
import com.zzq.weblog.common.domain.dos.UserDO;


public interface AdminUserService extends IService<UserDO> {
    Response updateAdminPassword(UpdateAdminPasswordReqVO updateAdminPasswordReqVO);
}
