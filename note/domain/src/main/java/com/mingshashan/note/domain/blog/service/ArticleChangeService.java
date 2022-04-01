package com.mingshashan.note.domain.blog.service;

import com.mingshashan.note.domain.blog.Article;

/**
 * 文章变更领域服务接口
 *
 * @author mingshashan
 */
public interface ArticleChangeService {

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
     */
    void deleteArticleById(Long articleId);

}
