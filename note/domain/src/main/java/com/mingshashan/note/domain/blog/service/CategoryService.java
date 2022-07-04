package com.mingshashan.note.domain.blog.service;

import com.mingshashan.note.domain.blog.Category;

public interface CategoryService {

    void createCategory(Category category);

    void deleteCategoryById(Long id);

    void updateCategory();

    void getCategoryById(Long id);

    void listCategory();
}
