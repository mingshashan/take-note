package com.mingshashan.note.repository.converter;

import com.mingshashan.note.domain.blog.Category;
import com.mingshashan.note.repository.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;
import org.mapstruct.factory.Mappers;

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
    //     @Mapping(source = "numberOfSeats", target = "seatCount")
    Category categoryEntity2Category(CategoryEntity categoryEntity);
}
