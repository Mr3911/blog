package com.qiang.modules.sys.service;

import com.qiang.modules.sys.entity.UsersEntity;


public interface RegisterService {


    /**
     * 注册
     * @param users
     * @return
     */
    public int insUsers(UsersEntity users);

    /**
     * 手机号检测
     * @param phone
     * @return
     */
    public int findByPhone(String phone);

    /**
     * 用户名检测
     * @param username
     * @return
     */
    public int findByUsername(String username);

}
