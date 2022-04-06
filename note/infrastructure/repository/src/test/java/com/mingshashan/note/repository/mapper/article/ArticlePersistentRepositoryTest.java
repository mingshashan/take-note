package com.mingshashan.note.repository.mapper.article;

import com.mingshashan.note.repository.entity.ArticleEntity;
import com.mingshashan.note.repository.mapper.ArticleMapper;
import com.mingshashan.note.repository.mapper.PersistenceConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author mingshashan
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PersistenceConfig.class)
public class ArticlePersistentRepositoryTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private ArticleMapper articleMapper;

    @Test
    public void givenAppContext_WhenInjected_ThenItShouldNotBeNull() {
        Assert.assertNotNull(applicationContext);
    }

    @Test
    public void saveArticle() {
        System.out.println(("----- selectAll method test ------"));
        ArticleEntity articleEntity = new ArticleEntity();
        articleEntity.setId(2L);
        articleEntity.setName("test-name");
//        articleEntity.setContent("test-content");
        int result = articleMapper.insert(articleEntity);
        Assert.assertTrue("ok", 1 == result);
    }


}
