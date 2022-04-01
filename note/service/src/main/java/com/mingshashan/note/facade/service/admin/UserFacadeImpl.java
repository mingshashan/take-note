package com.mingshashan.note.facade.service.admin;

import com.mingshashan.note.domain.admin.service.UserService;
import com.mingshashan.note.facade.admin.UserFacade;
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

}
