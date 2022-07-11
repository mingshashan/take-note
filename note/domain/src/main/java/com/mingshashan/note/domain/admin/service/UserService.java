package com.mingshashan.note.domain.admin.service;

import com.mingshashan.note.common.result.Page;
import com.mingshashan.note.domain.admin.User;

/**
 * user domain service
 *
 * @author mingshashan
 */

public interface UserService {

    Long createUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);

    Page<User> searchUser();
}
