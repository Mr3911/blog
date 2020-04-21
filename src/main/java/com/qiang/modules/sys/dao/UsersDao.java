package com.qiang.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qiang.modules.sys.entity.UsersEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;


@Repository
public interface UsersDao extends BaseMapper<UsersEntity> {

    int updUserMess(UsersEntity users);

    @Update("update users set password = #{password} where phone = #{phone}")
    int updUserPwd(@Param("phone") String phone, @Param("password") String password);

}
