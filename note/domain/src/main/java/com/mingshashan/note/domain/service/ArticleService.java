package com.mingshashan.note.domain.service;

import com.mingshashan.note.domain.Article;

/**
 * 领域服务
 * Article服务
 */
public interface ArticleService {

    void createArticle(Article article);

    void updateArticle(Article article);

    void deleteArticle(Article article);

    Article queryArticleById(Long id);


}
