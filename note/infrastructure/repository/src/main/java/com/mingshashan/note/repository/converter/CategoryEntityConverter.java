package com.mingshashan.note.repository.converter;

import com.mingshashan.note.domain.blog.Category;
import com.mingshashan.note.repository.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CategoryEntityConverter {

    CategoryEntityConverter INSTANCE = Mappers.getMapper(CategoryEntityConverter.class);

    /**
     * category to categoryEntity
     *
     * @param category
     * @return
     */
    CategoryEntity category2CategoryEntity(Category category);

    /**
     * category entity to category
     *
     * @param categoryEntity
     * @return
     */
    Category categoryEntity2Category(CategoryEntity categoryEntity);

    List<Category> entityList2CategoryList(List<CategoryEntity> categoryEntityList);
}
