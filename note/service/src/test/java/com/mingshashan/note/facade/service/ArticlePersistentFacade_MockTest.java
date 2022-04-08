package com.mingshashan.note.facade.service;

import com.mingshashan.note.domain.blog.service.ArticleQueryService;
import com.mingshashan.note.facade.service.blog.ArticleQueryFacadeImpl;
import com.mingshashan.note.facade.service.converter.ArticleConverter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author mingshashan
 */
@RunWith(MockitoJUnitRunner.class)
// @WithClasses(ArticleConverter.class)
// @RunWith(@RunWith(AnnotationProcessorTestRunner.class).class)
public class ArticlePersistentFacade_MockTest {

    @InjectMocks
    ArticleQueryFacadeImpl articleQueryFacade;

    @Mock
    ArticleQueryService articleQueryService;

    @Test
    public void contextLoads() throws Exception {
        assertThat(articleQueryFacade).isNotNull();
    }
}
