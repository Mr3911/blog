package com.qiang.modules.sys.service;

/**
 * @Description: 定时任务存储信息
 **/
public interface ScheduledService {

    /**
     * 网站浏览次数存入数据库
     */
    public void visitorCustom();

    /**
     * 博客访问量
     */
    public void lookBlog();

}
