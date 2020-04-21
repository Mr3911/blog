package com.qiang.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qiang.modules.sys.entity.VO.BlogMessageVOEntity;
import org.springframework.stereotype.Repository;

/**
 *
 **/
@Repository
public interface BlogDao extends BaseMapper<BlogMessageVOEntity> {
}
