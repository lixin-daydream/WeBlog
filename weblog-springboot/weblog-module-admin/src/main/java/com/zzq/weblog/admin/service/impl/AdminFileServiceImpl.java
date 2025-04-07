package com.zzq.weblog.admin.service.impl;

import com.zzq.weblog.admin.model.vo.file.UploadFileRspVO;
import com.zzq.weblog.admin.service.AdminFileService;
import com.zzq.weblog.admin.utils.MinioUtil;
import com.zzq.weblog.common.Response;
import com.zzq.weblog.common.enums.ResponseCodeEnum;
import com.zzq.weblog.common.exception.BizException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author: 张志强
 * @url: 
 * @date: 2023-04-17 12:08
 * @description: TODO
 **/
@Service
@Slf4j
public class AdminFileServiceImpl implements AdminFileService {

    @Autowired
    private MinioUtil minioUtil;

    @Override
    public Response uploadFile(MultipartFile file) {
        try {
            String url = minioUtil.uploadFile(file);
            return Response.success(UploadFileRspVO.builder().url(url).build());
        } catch (Exception e) {
            log.error("==> 上传文件异常: ", e);
            throw new BizException(ResponseCodeEnum.UPLOAD_FILE_ERROR);
        }
    }
}
