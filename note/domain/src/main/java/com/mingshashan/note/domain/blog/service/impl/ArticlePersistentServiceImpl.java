package com.mingshashan.note.domain.blog.service.impl;

import com.mingshashan.note.domain.blog.Article;
import com.mingshashan.note.domain.blog.repository.ArticlePersistentRepository;
import com.mingshashan.note.domain.blog.service.IArticlePersistentService;
import org.springframework.stereotype.Service;

/**
 * 文章变更领域服务实现
 *
 * @author mingshashan
 */
@Service
public class ArticlePersistentServiceImpl implements IArticlePersistentService {
    private final ArticlePersistentRepository articlePersistentRepository;

    public ArticlePersistentServiceImpl(ArticlePersistentRepository articlePersistentRepository) {
        this.articlePersistentRepository = articlePersistentRepository;
    }

    @Override
    public void createArticle(Article article) {

    }

    @Override
    public void updateArticle(Article article) {

    }

    @Override
    public Long deleteArticleById(Long articleId) {


        return articleId;
    }

}
