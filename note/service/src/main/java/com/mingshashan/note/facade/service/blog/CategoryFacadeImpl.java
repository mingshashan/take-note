package com.mingshashan.note.facade.service.blog;

import com.mingshashan.note.common.result.Result;
import com.mingshashan.note.domain.blog.Category;
import com.mingshashan.note.domain.blog.service.CategoryService;
import com.mingshashan.note.facade.blog.CategoryFacade;
import com.mingshashan.note.facade.service.converter.CategoryConverter;
import com.mingshashan.note.facade.vo.blog.CategoryVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

/**
 * category facade implement, rest controller
 *
 * @author mingshashan
 */
@RequestMapping("categories")
@RestController
public class CategoryFacadeImpl implements CategoryFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(CategoryFacadeImpl.class);

    private final CategoryService categoryService;

    public CategoryFacadeImpl(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public Result<Void> createCategory(@NotNull @Valid CategoryVO categoryVO) {
        LOGGER.info("createCategory name: {0}", categoryVO.getName());
        Category category = CategoryConverter.INSTANCE.categoryVO2Category(categoryVO);
        categoryService.createCategory(category);
        return Result.ok();
    }

    @Override
    public Result<Void> deleteCategoryById(@NotNull @Positive(message = "id必须为大于0的数") Long id) {
        LOGGER.info("deleteCategoryById id = {0}", id);
        categoryService.deleteCategoryById(id);
        return Result.ok();
    }

    @Override
    public Result<CategoryVO> getCategoryById(@NotNull @Positive(message = "id必须为大于0的数") Long id) {
        Category category = categoryService.getCategoryById(id);

        CategoryVO categoryVO = CategoryConverter.INSTANCE.category2CategoryVO(category);

        return Result.ok(categoryVO);
    }
}
