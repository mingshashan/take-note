package com.mingshashan.note.repository.mapper.article;

import com.mingshashan.note.domain.blog.Category;
import com.mingshashan.note.repository.converter.CategoryEntityConverter;
import com.mingshashan.note.repository.entity.CategoryEntity;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void categoryEntity_Test() {
        CategoryEntity categoryEntity = new CategoryEntity();
        CategoryEntityConverter.INSTANCE.categoryEntity2Category(categoryEntity);

        Category category = new Category();
        CategoryEntityConverter.INSTANCE.category2CategoryEntity(category);
    }
}
