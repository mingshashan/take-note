package com.mingshashan.note.domain.blog.service.impl;

import com.mingshashan.note.common.request.PageRequest;
import com.mingshashan.note.common.result.Page;
import com.mingshashan.note.domain.blog.Category;
import com.mingshashan.note.domain.blog.repository.CategoryRepository;
import com.mingshashan.note.domain.blog.service.CategoryService;
import org.springframework.stereotype.Service;

/**
 * category domain service
 *
 * @author mingshashan
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void createCategory(Category category) {
        categoryRepository.createCategory(category);
    }

    @Override
    public void deleteCategoryById(Long id) {
        categoryRepository.deleteCategoryById(id);
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.getCategoryById(id);
    }

    @Override
    public Page<Category> queryCategory(PageRequest<Category> pageRequest) {
        return categoryRepository.queryCategory(pageRequest.getPage(), pageRequest.getSize());
    }
}
