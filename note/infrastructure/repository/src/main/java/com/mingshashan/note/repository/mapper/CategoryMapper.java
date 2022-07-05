package com.mingshashan.note.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mingshashan.note.repository.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * category mapper
 * @author mingshashan
 */
@Mapper
public interface CategoryMapper extends BaseMapper<CategoryEntity> {

    /**
     * 插入
     *
     * @param categoryEntity
     * @return
     */
    int createCategory(@Param("categoryEntity") CategoryEntity categoryEntity);

    /**
     * 根据id删除
     *
     * @param id
     */
    void deleteCategoryById(@Param("id") Long id);

    /**
     * 更新（category 只能更新name，且要防name重名）
     *
     * @param categoryEntity
     */
    void updateCategory(@Param("categoryEntity") CategoryEntity categoryEntity);

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    CategoryEntity getCategoryById(@Param("id") Long id);

    /**
     * page query category
     * @param page
     * @param size
     * @return
     */
    List<CategoryEntity> queryCategory(@Param("page") int page, @Param("size") int size);
}
