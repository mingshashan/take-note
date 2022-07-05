package com.mingshashan.note.domain.blog.service;

import com.mingshashan.note.common.request.PageRequest;
import com.mingshashan.note.common.result.Page;
import com.mingshashan.note.domain.blog.Category;

/**
 * category service
 *
 * @author mingshashan
 */
public interface CategoryService {

    /**
     * create category
     *
     * @param category
     */
    void createCategory(Category category);

    /**
     * delete category by id
     *
     * @param id
     */
    void deleteCategoryById(Long id);

    /**
     * get category by id
     *
     * @param id
     * @return
     */
    Category getCategoryById(Long id);

    /**
     * page query category
     *
     * @return
     */
    Page<Category> queryCategory(PageRequest<Category> pageRequest);
}
