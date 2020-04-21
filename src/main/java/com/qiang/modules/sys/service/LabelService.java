package com.qiang.modules.sys.service;

import com.qiang.modules.sys.entity.LabelEntity;

import java.util.List;

/**
 * @Description: 标签业务接口
 **/
public interface LabelService {

    /**
     * 新增标签
     * @param label 标签名
     * @return
     */
    int insLabel(String[] label);

    /**
     * 查询标签全部
     * @return
     */
    List<LabelEntity> selAllLabel();
}
