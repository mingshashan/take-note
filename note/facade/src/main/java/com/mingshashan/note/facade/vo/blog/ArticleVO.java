package com.mingshashan.note.facade.vo.blog;

import com.mingshashan.note.facade.validation.ValidationGroup;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * article VO
 *
 * @author mingshashan
 */
@Getter
@Setter
@ToString
public class ArticleVO {

    @NotNull(groups = {ValidationGroup.Update.class}, message = "更新文章，文章id不能为空")
    private Long id;

    @NotNull(message = "文章作者不能为空")
    private Long authorId;

    @NotBlank(message = "文章名称不能为空")
    private String title;

    @ToString.Exclude
    private String backgroundImage;

    @NotBlank(message = "文章内容不能为空")
    @ToString.Exclude
    private String content;

    @ToString.Exclude
    private List<TagVO> tagVOList;

    @ToString.Exclude
    private List<CategoryVO> categoryList;
}
