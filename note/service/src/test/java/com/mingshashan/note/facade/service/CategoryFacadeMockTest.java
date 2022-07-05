package com.mingshashan.note.facade.service;

import com.mingshashan.note.common.result.Result;
import com.mingshashan.note.domain.blog.Category;
import com.mingshashan.note.domain.blog.service.CategoryService;
import com.mingshashan.note.facade.service.blog.CategoryFacadeImpl;
import com.mingshashan.note.facade.vo.blog.CategoryVO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author mingshashan
 */
@RunWith(MockitoJUnitRunner.class)
// @WithClasses(ArticleConverter.class)
// @RunWith(@RunWith(AnnotationProcessorTestRunner.class).class)
public class CategoryFacadeMockTest {

    @InjectMocks
    CategoryFacadeImpl categoryFacade;

    @Mock
    CategoryService categoryService;

    @Test
    public void contextLoads() throws Exception {
        assertThat(categoryFacade).isNotNull();
    }

    @Test
    public void createCategory_Test() {
        CategoryVO categoryVO = new CategoryVO();
        categoryVO.setName("散文");
        categoryFacade.createCategory(categoryVO);
    }

    @Test
    public void deleteCategoryById_Test() {
        categoryFacade.deleteCategoryById(1L);
    }

    @Test
    public void getCategoryById_Test() {
        Category category = new Category();
        category.setId(1L);
        category.setName("散文");
        Mockito.when(categoryService.getCategoryById(1L)).thenReturn(category);
        Result<CategoryVO> categoryVOResult = categoryFacade.getCategoryById(1L);

        Assert.assertEquals(category.getId(), categoryVOResult.getData().getId());
        Assert.assertEquals(category.getName(), categoryVOResult.getData().getName());
    }
}
