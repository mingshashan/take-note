package com.mingshashan.note.facade.service.converter;

import com.mingshashan.note.domain.blog.Article;
import com.mingshashan.note.facade.vo.blog.ArticleVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author mingshashan
 */
@Mapper
public interface ArticleConverter {

    ArticleConverter INSTANCE = Mappers.getMapper(ArticleConverter.class);

    /**
     * Article to ArticleVO
     *
     * @param article
     * @return
     */
    ArticleVO article2ArticleVO(Article article);
}
