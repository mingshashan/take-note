package com.mingshashan.note.facade.blog;

import com.mingshashan.note.facade.response.Result;
import com.mingshashan.note.facade.vo.blog.ArticleVO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

/**
 * article change facade
 *
 * @author mingshashan
 */
public interface ArticleChangeFacade {

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
     * @param articleId
     * @return
     */
    Result<Void> deleteArticleById(@NotNull(message = "文章ID不能为空")
                                   @Positive(message = "文章ID必需为大于0的整数") Long articleId);
}
