package com.mingshashan.note.facade.vo.blog;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
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

    @NotBlank(message = "文章名称不能为空")
    private String name;

    @NotBlank(message = "文章作者不能为空")
    private String author;

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
