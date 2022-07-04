package com.mingshashan.note.domain.blog.repository;

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
     */
    void updateCategory(Category category);

    /**
     * get category by id
     *
     * @param id
     */
    Category getCategoryById(Long id);

    /**
     * list page category
     */
    void listCategory();
}
