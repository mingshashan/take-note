package com.mingshashan.note.facade.service.converter;

import com.mingshashan.note.domain.admin.User;
import com.mingshashan.note.facade.vo.user.UserVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * user converter
 *
 * @author mingshashan
 */
@Mapper
public interface UserConverter {

    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);

    User user2UserVO(UserVO userVO);

    UserVO userVO2User(User user);

}
