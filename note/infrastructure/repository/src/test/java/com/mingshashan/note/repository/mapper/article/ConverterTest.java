package com.mingshashan.note.repository.mapper.article;

import com.mingshashan.note.repository.converter.CategoryEntityConverter;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void categoryEntity_Test() {
        CategoryEntityConverter.INSTANCE.categoryEntity2Category(null);
        CategoryEntityConverter.INSTANCE.category2CategoryEntity(null);
    }
}
