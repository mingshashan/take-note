package com.mingshashan.note.facade.blog;

import com.mingshashan.note.common.result.Result;
import com.mingshashan.note.facade.vo.blog.ArticleVO;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

/**
 * article change facade
 *
 * @author mingshashan
 */
public interface ArticlePersistentFacade {

    /**
     * create article
     *
     * @param articleVO the article content
     * @return
     */
    Result<Long> createArticle(ArticleVO articleVO);

    /**
     * update article
     *
     * @param articleVO the
     * @return
     */
    Result<ArticleVO> updateArticle(ArticleVO articleVO);

    /**
     * delete article by id
     *
     * @param articleId
     * @return
     */
    Result<Void> deleteArticleById(Long articleId);
}
