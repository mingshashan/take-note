package com.mingshashan.note.repository.repository;

import com.mingshashan.note.common.result.Page;
import com.mingshashan.note.domain.admin.User;
import com.mingshashan.note.domain.blog.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserRepositoryImpl implements UserRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserRepositoryImpl.class);

    @Override
    public Long createUser(User user) {


        return null;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public Page<User> searchUser(User user) {
        return null;
    }
}
