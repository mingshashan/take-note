package com.mingshashan.note.repository.converter;

import com.mingshashan.note.domain.blog.Article;
import com.mingshashan.note.repository.entity.ArticleEntity;
import org.apache.ibatis.annotations.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ArticleEntityConverter {

    ArticleEntityConverter INSTANCE = Mappers.getMapper(ArticleEntityConverter.class);

    /**
     * Article to ArticleVO
     *
     * @param article
     * @return
     */
    ArticleEntity article2ArticleEntity(Article article);
}
