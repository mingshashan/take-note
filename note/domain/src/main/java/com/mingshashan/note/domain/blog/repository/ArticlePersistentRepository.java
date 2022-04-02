package com.mingshashan.note.domain.blog.repository;

/**
 * article persistent repository
 *
 * @author mingshashan
 */
public interface ArticlePersistentRepository {

    /**
     * delete article by id
     *
     * @param articleId
     * @return
     */
    Long deleteArticleById(Long articleId);
}
