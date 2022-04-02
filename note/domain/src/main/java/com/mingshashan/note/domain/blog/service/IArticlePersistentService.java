package com.mingshashan.note.domain.blog.service;

import com.mingshashan.note.domain.blog.Article;

/**
 * 文章变更领域服务接口
 *
 * @author mingshashan
 */
public interface IArticlePersistentService {

    /**
     * create article
     *
     * @param article
     */
    void createArticle(Article article);

    /**
     * udpate article
     *
     * @param article
     */
    void updateArticle(Article article);

    /**
     * delete article by id
     *
     * @param articleId
     * @return
     */
    Long deleteArticleById(Long articleId);

}
