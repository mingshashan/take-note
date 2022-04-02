package com.mingshashan.note.facade.service.blog;

import com.mingshashan.note.common.result.Result;
import com.mingshashan.note.domain.blog.service.IArticlePersistentService;
import com.mingshashan.note.facade.blog.ArticlePersistentFacade;
import com.mingshashan.note.facade.vo.blog.ArticleVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * article persistent service
 * @author mingshashan
 */
@RestController
@RequestMapping("/article/change")
public class ArticlePersistentFacadeImpl implements ArticlePersistentFacade {

    private final IArticlePersistentService articlePersistentService;

    public ArticlePersistentFacadeImpl(IArticlePersistentService articlePersistentService) {
        this.articlePersistentService = articlePersistentService;
    }

    @PostMapping("/create")
    @Override
    public Result<Long> createArticle(ArticleVO articleVO) {
        return null;
    }

    @PostMapping("/update")
    @Override
    public Result<ArticleVO> updateArticle(ArticleVO articleVO) {
        return null;
    }

    @PostMapping("/delete")
    @Override
    public Result<Void> deleteArticleById(Long articleId) {
        articlePersistentService.deleteArticleById(articleId);
        return Result.<Void>builder().build();
    }
}
