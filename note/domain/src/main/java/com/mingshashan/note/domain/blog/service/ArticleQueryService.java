package com.mingshashan.note.domain.blog.service;

import com.mingshashan.note.domain.blog.Article;

/**
 * 文章查询领域服务
 *
 * @author mingshashan
 */
public interface ArticleQueryService {

    /**
     * get article by id
     *
     * @param articleId
     * @return
     */
    Article getArticleById(Long articleId);
}
