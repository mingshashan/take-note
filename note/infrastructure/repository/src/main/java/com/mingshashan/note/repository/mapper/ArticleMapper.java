package com.mingshashan.note.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mingshashan.note.repository.entity.ArticleEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * article mapper
 *
 * @author mingshashan
 */
@Mapper
public interface ArticleMapper extends BaseMapper<ArticleEntity> {

}
