package com.qiang.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qiang.modules.sys.entity.GuestEntity;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface GuestDao extends BaseMapper<GuestEntity> {

    List<GuestEntity> getAllGuest();

    @Update("update guest set likes = likes - 1 where id = #{arg0}")
    int updDesRepGuest(Long id);

    @Update("update guest set likes = likes + 1 where id = #{arg0}")
    int updInsRepGuest(Long id);

    @Update("update guest set is_read = 0 where id = #{arg0}")
    int updOneNotGuestMana(Long id);

}
