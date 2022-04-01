package com.mingshashan.note.facade.service.blog;

import com.mingshashan.note.domain.blog.service.ArticleChangeService;
import com.mingshashan.note.facade.blog.ArticleChangeFacade;
import com.mingshashan.note.facade.vo.blog.ArticleVO;
import com.mingshashan.note.facade.response.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mingshashan
 */
@RestController
@RequestMapping("/article/change")
public class ArticleChangeFacadeImpl implements ArticleChangeFacade {

    private final ArticleChangeService articleChangeService;

    public ArticleChangeFacadeImpl(ArticleChangeService articleChangeService) {
        this.articleChangeService = articleChangeService;
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
        return null;
    }
}
