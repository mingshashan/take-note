package com.mingshashan.note.facade.service.converter;

import com.mingshashan.note.domain.blog.Article;
import com.mingshashan.note.facade.vo.blog.ArticleVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * article converter
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
    // @Mapping(source = "numberOfSeats", target = "seatCount")
    ArticleVO article2ArticleVO(Article article);

    /**
     * articleVO to article
     *
     * @param articleVO
     * @return
     */
    Article articleVO2Article(ArticleVO articleVO);
}
