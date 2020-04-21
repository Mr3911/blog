package com.qiang.modules.sys.service;

import com.qiang.modules.sys.entity.VO.BlogMessageVOEntity;

public interface RedisService {

    /**
     * 手机号和用户名存入缓存
     * @param phone
     * @param username
     */
    public void SavePhoneAndUsername(String phone, String username);

    /**
     * 保存博客发布信息
     * @param blogMessageVOEntity
     */
    public void SaveEditBlog(BlogMessageVOEntity blogMessageVOEntity);

}
