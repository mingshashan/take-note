package com.mingshashan.note.domain.blog.service.impl;

import com.mingshashan.note.domain.blog.Article;
import com.mingshashan.note.domain.blog.repository.ArticleRepository;
import com.mingshashan.note.domain.blog.service.ArticlePersistentService;
import org.springframework.stereotype.Service;

/**
 * 文章变更领域服务实现
 *
 * @author mingshashan
 */
@Service
public class ArticlePersistentServiceImpl implements ArticlePersistentService {
    private final ArticleRepository articlePersistentRepository;

    public ArticlePersistentServiceImpl(ArticleRepository articlePersistentRepository) {
        this.articlePersistentRepository = articlePersistentRepository;
    }

    @Override
    public Long createArticle(Article article) {



        return null;
    }

    @Override
    public void updateArticle(Article article) {

    }

    @Override
    public Long deleteArticleById(Long articleId) {


        return articleId;
    }

}
