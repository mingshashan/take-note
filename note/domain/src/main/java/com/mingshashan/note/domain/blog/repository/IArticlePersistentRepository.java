package com.mingshashan.note.domain.blog.repository;

/**
 * article persistent repository
 *
 * @author mingshashan
 */
public interface IArticlePersistentRepository {

    /**
     * delete article by id
     *
     * @param articleId
     */
    void deleteArticleById(Long articleId);
}
