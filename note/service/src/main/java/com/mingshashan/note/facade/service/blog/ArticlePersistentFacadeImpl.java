package com.mingshashan.note.facade.service.blog;

import com.mingshashan.note.common.api.ApiVersion;
import com.mingshashan.note.common.result.Result;
import com.mingshashan.note.domain.blog.Article;
import com.mingshashan.note.domain.blog.service.ArticlePersistentService;
import com.mingshashan.note.facade.blog.ArticlePersistentFacade;
import com.mingshashan.note.facade.service.converter.ArticleConverter;
import com.mingshashan.note.facade.vo.blog.ArticleVO;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

/**
 * article persistent service
 *
 * @author mingshashan
 */
@ApiVersion(version = "v1")
@RestController
@RequestMapping("/articles")
public class ArticlePersistentFacadeImpl implements ArticlePersistentFacade {

    private final ArticlePersistentService articlePersistentService;

    public ArticlePersistentFacadeImpl(ArticlePersistentService articlePersistentService) {
        this.articlePersistentService = articlePersistentService;
    }

    @PostMapping("/create")
    @Override
    public Result<Long> createArticle(@Valid ArticleVO articleVO) {

        Article article = ArticleConverter.INSTANCE.articleVO2Article(articleVO);
        Long id = articlePersistentService.createArticle(article);

        return Result.ok(id);
    }

    @PostMapping("/update")
    @Override
    public Result<ArticleVO> updateArticle(@Valid ArticleVO articleVO) {
        Article article = ArticleConverter.INSTANCE.articleVO2Article(articleVO);
        articlePersistentService.createArticle(article);
        return null;
    }

    @DeleteMapping
    @Override
    public Result<Void> deleteArticleById(@NotNull(message = "文章ID不能为空")
                                              @Positive(message = "文章ID必需为大于0的整数") Long articleId) {
        articlePersistentService.deleteArticleById(articleId);
        return Result.ok();
    }
}
