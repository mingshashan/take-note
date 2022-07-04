package com.mingshashan.note.facade.blog;

import com.mingshashan.note.common.result.Result;
import com.mingshashan.note.facade.vo.blog.CategoryVO;

/**
 * category facade
 *
 * @author mingshashan
 */
public interface CategoryFacade {

    Result<Void> createCategory(CategoryVO categoryVO);

    Result<Void> deleteCategoryById(Long id);

    Result<CategoryVO> getCategoryById(Long id);

}
