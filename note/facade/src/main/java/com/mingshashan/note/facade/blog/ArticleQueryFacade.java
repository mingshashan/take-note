package com.mingshashan.note.facade.blog;

import com.mingshashan.note.facade.response.Result;
import com.mingshashan.note.facade.vo.blog.ArticleVO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

/**
 * article query facade
 *
 * @author mingshashan
 */
public interface ArticleQueryFacade {

    /**
     * get article by id
     *
     * @param articleId article id
     * @return article
     */
    Result<ArticleVO> getArticleById(@NotNull(message = "文章ID不能为空")
                                     @Positive(message = "文章ID必需为大于0的整数") Long articleId);
}
