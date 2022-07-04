package com.mingshashan.note.domain.blog.repository;

import com.mingshashan.note.domain.blog.Article;

/**
 * article persistent repository
 *
 * @author mingshashan
 */
public interface ArticleRepository {

    /**
     * delete article by id
     *
     * @param articleId
     * @return
     */
    Long deleteArticleById(Long articleId);

    Article getArticleById(Long articleId);
}
