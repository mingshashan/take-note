package com.mingshashan.note.domain.blog;

import com.mingshashan.note.domain.blog.repository.ArticlePersistentRepository;
import com.mingshashan.note.domain.blog.service.impl.ArticlePersistentServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Random;

/**
 * @author mingshashan
 */
public class ArticlePersistentServiceTest {

    @InjectMocks
    private ArticlePersistentServiceImpl articlePersistentService;

    @Mock
    private ArticlePersistentRepository articlePersistentRepository;

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void createArticle_Test() {

    }


    @Test
    public void deleteArticleById_OK_Test() {
        Long id = Math.abs(new Random().nextLong());
        Mockito.when(articlePersistentRepository.deleteArticleById(id))
                .thenReturn(id);

        Long result = articlePersistentService.deleteArticleById(id);
        Assert.assertTrue("ok", id == result);
    }
}
