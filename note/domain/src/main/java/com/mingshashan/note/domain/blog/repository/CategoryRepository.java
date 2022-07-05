package com.mingshashan.note.domain.blog.repository;

import com.mingshashan.note.common.result.Page;
import com.mingshashan.note.domain.blog.Category;

/**
 * category repository
 *
 * @author mingshashan
 */
public interface CategoryRepository {

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
     * update category
     *
     * @param category
     */
    void updateCategory(Category category);

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
     * @param page
     * @param size
     * @return
     */
    Page<Category> queryCategory(int page, int size);
}
