package com.mingshashan.note.repository.article;

import com.mingshashan.note.domain.blog.Category;
import com.mingshashan.note.domain.blog.repository.CategoryRepository;
import com.mingshashan.note.repository.converter.CategoryEntityConverter;
import com.mingshashan.note.repository.entity.CategoryEntity;
import com.mingshashan.note.repository.mapper.CategoryMapper;

import java.util.Optional;

public class CategoryRepositoryImpl implements CategoryRepository {

    private final CategoryMapper categoryMapper;

    public CategoryRepositoryImpl(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    @Override
    public void createCategory(Category category) {
        CategoryEntity categoryEntity = CategoryEntityConverter.INSTANCE.category2CategoryEntity(category);

        categoryMapper.createCategory(categoryEntity);
    }

    @Override
    public void deleteCategoryById(Long id) {
        categoryMapper.deleteCategoryById(id);
    }

    @Override
    public void updateCategory(Category category) {
        CategoryEntity categoryEntity = CategoryEntityConverter.INSTANCE.category2CategoryEntity(category);

        categoryMapper.updateCategory(categoryEntity);
    }

    @Override
    public Category getCategoryById(Long id) {
        CategoryEntity categoryEntity =
                categoryMapper.getCategoryById(id);

        return CategoryEntityConverter.INSTANCE.categoryEntity2Category(Optional.ofNullable(categoryEntity).orElse(null));
    }

    @Override
    public void listCategory() {

    }
}
