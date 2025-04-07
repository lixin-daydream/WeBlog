package com.zzq.weblog.admin.service;

import com.zzq.weblog.common.Response;
import org.springframework.web.multipart.MultipartFile;

public interface AdminFileService {
    Response uploadFile(MultipartFile file);
}
