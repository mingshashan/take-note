package com.mingshashan.note.facade.admin;

import com.mingshashan.note.common.result.Page;
import com.mingshashan.note.common.result.Result;
import com.mingshashan.note.facade.vo.user.UserVO;

/**
 * user facade
 *
 * @author mingshashan
 */
public interface UserFacade {

    Result<Long> createUser(UserVO userVO);

    Result<Void> updateUser(UserVO userVO);

    Result<Void> deleteUser(Long id);

    Page<UserVO> searchUser();

}
