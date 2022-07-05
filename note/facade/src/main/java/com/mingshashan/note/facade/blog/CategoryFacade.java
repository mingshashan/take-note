package com.mingshashan.note.facade.blog;

import com.mingshashan.note.common.result.Result;
import com.mingshashan.note.facade.vo.blog.CategoryVO;

/**
 * category facade
 *
 * @author mingshashan
 */
public interface CategoryFacade {

    /**
     * create category
     *
     * @param categoryVO
     * @return
     */
    Result<Void> createCategory(CategoryVO categoryVO);

    /**
     * delete category by id
     *
     * @param id
     * @return
     */
    Result<Void> deleteCategoryById(Long id);

    /**
     * get category by id
     *
     * @param id
     * @return
     */
    Result<CategoryVO> getCategoryById(Long id);

}
