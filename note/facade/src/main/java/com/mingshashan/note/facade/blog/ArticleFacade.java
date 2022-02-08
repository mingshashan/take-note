package com.mingshashan.note.facade.blog;

import com.mingshashan.note.facade.response.ArticleVO;
import com.mingshashan.note.facade.response.Result;

/**
 * article facade
 */
public interface ArticleFacade {
    Result<ArticleVO> createArticle(ArticleVO articleVO);
}
