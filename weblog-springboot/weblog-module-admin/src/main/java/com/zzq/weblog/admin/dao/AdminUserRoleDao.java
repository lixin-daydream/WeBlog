package com.zzq.weblog.admin.dao;


import com.zzq.weblog.common.domain.dos.UserRoleDO;

import java.util.List;

public interface AdminUserRoleDao {
    List<UserRoleDO> selectByUsername(String username);
}
