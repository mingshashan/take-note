package com.mingshashan.note.domain.blog.service.impl;

import com.mingshashan.note.domain.blog.Article;
import com.mingshashan.note.domain.blog.repository.ArticleRepository;
import com.mingshashan.note.domain.blog.service.ArticleQueryService;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * 文章查询领域服务实现
 *
 * @author mingshashan
 */
@Service
public class ArticleQueryServiceImpl implements ArticleQueryService {

    private final ArticleRepository articlePersistentRepository;

    public ArticleQueryServiceImpl(ArticleRepository articlePersistentRepository) {
        this.articlePersistentRepository = articlePersistentRepository;
    }

    @Override
    public Article getArticleById(Long articleId) {
        return Optional.of(articlePersistentRepository.getArticleById(articleId))
                .orElse(null);
    }
}
