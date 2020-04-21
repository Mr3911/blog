package com.qiang.modules.sys.service;

/**
 * @Description: 网页信息
 **/
public interface IndexService {

    /**
     * 文章总数
     * @return
     */
    public Long myArticlesCount();

    /**
     * 标签总数
     * @return
     */
    public int myLabelsCount();


    /**
     * 评论总数
     * @return
     */
    public Integer myReportsCount();

    /**
     * 留言总数
     * @return
     */
    public Integer myGuestCount();

    /**
     * 网站访问量
     * @return
     */
    public int myWebCount();

}
