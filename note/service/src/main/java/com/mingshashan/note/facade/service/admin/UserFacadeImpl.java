package com.mingshashan.note.facade.service.admin;

import com.mingshashan.note.common.result.Page;
import com.mingshashan.note.common.result.Result;
import com.mingshashan.note.domain.admin.User;
import com.mingshashan.note.domain.admin.service.UserService;
import com.mingshashan.note.facade.admin.UserFacade;
import com.mingshashan.note.facade.service.converter.UserConverter;
import com.mingshashan.note.facade.vo.user.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mingshashan
 */
@RestController
@RequestMapping("users")
public class UserFacadeImpl implements UserFacade {

    private static final Logger logger = LoggerFactory.getLogger(UserFacadeImpl.class);

    private final UserService userService;

    public UserFacadeImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public Result<Long> createUser(UserVO userVO) {

        User user = UserConverter.INSTANCE.user2UserVO(userVO);

        Long userId = userService.createUser(user);
        return Result.ok(userId);
    }

    @Override
    public Result<Void> updateUser(UserVO userVO) {
        return null;
    }

    @Override
    public Result<Void> deleteUser(Long id) {
        return null;
    }

    @Override
    public Page<UserVO> searchUser() {
        return null;
    }
}
