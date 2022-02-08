package com.mingshashan.note.facade.service.admin;

import com.mingshashan.note.domain.service.admin.UserService;
import com.mingshashan.note.facade.UserVO;
import com.mingshashan.note.facade.admin.UserFacade;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserFacadeImpl implements UserFacade {

    private final UserService userService;

    public UserFacadeImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserVO createUser(UserVO userVO) {
        return null;
    }
}
