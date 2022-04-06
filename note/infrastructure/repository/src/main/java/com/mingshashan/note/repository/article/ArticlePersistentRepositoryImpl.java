package com.mingshashan.note.repository.article;

import com.mingshashan.note.domain.blog.repository.ArticlePersistentRepository;
import org.springframework.stereotype.Component;

/**
 * @author mingshashan
 */
@Component
public class ArticlePersistentRepositoryImpl implements ArticlePersistentRepository {

    @Override
    public Long deleteArticleById(Long articleId) {
        return articleId;
    }
}
