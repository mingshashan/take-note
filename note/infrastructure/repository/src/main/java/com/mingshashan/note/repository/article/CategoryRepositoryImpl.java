package com.mingshashan.note.repository.article;

import com.baomidou.mybatisplus.core.conditions.ISqlSegment;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mingshashan.note.common.result.Page;
import com.mingshashan.note.common.result.PageResult;
import com.mingshashan.note.domain.blog.Category;
import com.mingshashan.note.domain.blog.repository.CategoryRepository;
import com.mingshashan.note.repository.converter.CategoryEntityConverter;
import com.mingshashan.note.repository.entity.CategoryEntity;
import com.mingshashan.note.repository.mapper.CategoryMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * category repository
 *
 * @author mingshashan
 */
@Repository
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
    public Page<Category> queryCategory(int page, int size) {

        Wrapper<CategoryEntity> wrapper = new QueryWrapper();
        wrapper.getExpression().add((ISqlSegment) () -> "is_valid = 0");
        Long count = categoryMapper.selectCount(wrapper);
        if (null == count || 0 == count) {
            return PageResult.empty();
        }

        List<CategoryEntity> entityList = categoryMapper.queryCategory(page, size);
        List<Category> categoryList = Optional.ofNullable(entityList)
                .map(CategoryEntityConverter.INSTANCE::entityList2CategoryList)
                .orElse(new ArrayList<>());

        return new PageResult<>(categoryList, page, size, count);
    }
}
