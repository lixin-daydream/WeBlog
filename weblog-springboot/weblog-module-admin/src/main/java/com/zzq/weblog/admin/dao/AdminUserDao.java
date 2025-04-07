package com.zzq.weblog.admin.dao;

import com.zzq.weblog.common.domain.dos.UserDO;

public interface AdminUserDao {
    UserDO selectByUsername(String username);

    int updateAdminPassword(UserDO userDO);
}
