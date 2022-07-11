package com.mingshashan.note.domain.blog.repository;

import com.mingshashan.note.common.result.Page;
import com.mingshashan.note.domain.admin.User;

/**
 * user repository
 *
 * @author mingshashan
 */
public interface UserRepository {

    /**
     * create user
     *
     * @param user
     * @return
     */
    Long createUser(User user);

    /**
     * update user
     *
     * @param user
     * @return
     */
    void updateUser(User user);

    /**
     * delete user
     *
     * @param id
     * @return
     */
    void deleteUser(Long id);

    /**
     * search user
     *
     * @param user
     * @return
     */
    Page<User> searchUser(User user);
}
