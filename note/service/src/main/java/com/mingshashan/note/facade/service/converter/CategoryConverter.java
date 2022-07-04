package com.mingshashan.note.facade.service.converter;

import com.mingshashan.note.domain.blog.Category;
import com.mingshashan.note.facade.vo.blog.CategoryVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author mingshashan
 */
@Mapper
public interface CategoryConverter {

    CategoryConverter INSTANCE = Mappers.getMapper(CategoryConverter.class);

    /**
     * categoryVO to category
     *
     * @param categoryVO
     * @return
     */
    Category categoryVO2Category(CategoryVO categoryVO);

    /**
     * category to categoryVO
     * @param category
     * @return
     */
    CategoryVO category2CategoryVO(Category category);
}
