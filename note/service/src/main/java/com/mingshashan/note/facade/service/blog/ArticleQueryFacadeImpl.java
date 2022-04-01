package com.mingshashan.note.facade.service.blog;

import com.mingshashan.note.domain.blog.Article;
import com.mingshashan.note.domain.blog.service.ArticleQueryService;
import com.mingshashan.note.facade.blog.ArticleQueryFacade;
import com.mingshashan.note.facade.response.Result;
import com.mingshashan.note.facade.service.converter.ArticleConverter;
import com.mingshashan.note.facade.vo.blog.ArticleVO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

/**
 * @author mingshashan
 */
public class ArticleQueryFacadeImpl implements ArticleQueryFacade {

    private final ArticleQueryService articleQueryService;
    private final ArticleConverter articleConverter = ArticleConverter.INSTANCE;

    public ArticleQueryFacadeImpl(ArticleQueryService articleQueryService) {
        this.articleQueryService = articleQueryService;
    }

    @Override
    public Result<ArticleVO> getArticleById(@NotNull(message = "文章ID不能为空") @Positive(message = "文章ID必需为大于0的整数") Long articleId) {

        Article article = articleQueryService.getArticleById(articleId);
        ArticleVO articleVO =articleConverter.article2ArticleVO(article);
        return Result.ok(articleVO);
    }
}
