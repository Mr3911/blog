package com.qiang.modules.sys.dao;

import com.qiang.modules.sys.entity.VO.UsersVOEntity;
import org.springframework.stereotype.Repository;


@Repository
public interface UsersLoginDao {
    UsersVOEntity findByPhone(String phone);

}
