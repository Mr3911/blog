package com.qiang.modules.sys.service;

import com.qiang.modules.sys.entity.VO.BlogMessageVOEntity;

/**
 * @Description: 博客发布接口
 **/
public interface BlogService {

    /**
     * 博客发布
     * @param blogMessage 博客实体类
     * @return
     */
    void publishBlog(BlogMessageVOEntity blogMessage);

    /**
     * 编辑文章
     * @param blogMessageVO
     * @return
     */
    Boolean updBlogByBlogId(BlogMessageVOEntity blogMessageVO);

    /**
     * 通过id查询该文章详情
     * @param id
     * @return
     */
    BlogMessageVOEntity findBlogById(long id);

    /**
     * 修改回显文章相关信息
     * @param id
     * @return
     */
    BlogMessageVOEntity EchoBlogByBlogId(long id);


}
