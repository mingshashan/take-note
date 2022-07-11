package com.mingshashan.note.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mingshashan.note.repository.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * user mapper
 *
 * @author mingshashan
 */
public interface UserMapper extends BaseMapper<UserEntity> {

    /**
     * search user
     *
     * @param userEntity
     * @return
     */
    Long countUser(@Param("userEntity") UserEntity userEntity);

    /**
     * search user
     *
     * @param userEntity
     * @return
     */
    List<UserEntity> searchUser(@Param("userEntity") UserEntity userEntity);
}
