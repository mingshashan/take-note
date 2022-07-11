package com.mingshashan.note.repository.repository;

import com.mingshashan.note.domain.blog.Article;
import com.mingshashan.note.domain.blog.repository.ArticleRepository;
import com.mingshashan.note.repository.entity.ArticleEntity;
import com.mingshashan.note.repository.mapper.ArticleMapper;
import org.springframework.stereotype.Component;

/**
 * @author mingshashan
 */
@Component
public class ArticleRepositoryImpl implements ArticleRepository {

    private final ArticleMapper articleMapper;

    public ArticleRepositoryImpl(ArticleMapper articleMapper) {
        this.articleMapper = articleMapper;
    }

    @Override
    public Long deleteArticleById(Long articleId) {
        articleMapper.deleteById(articleId);
        return articleId;
    }

    @Override
    public Article getArticleById(Long articleId) {
        ArticleEntity articleEntity = articleMapper.selectById(articleId);
        return null;
    }
}
