package com.mingshashan.note.facade.vo.blog;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

/**
 * category
 *
 * @author mingshashan
 */
@Getter
@Setter
public class CategoryVO {

    private Long id;

    /**
     * name
     */
    @NotBlank(message = "category name不能为空")
    @Length(min = 1, max = 128, message = "category name的长度为[1~128]")
    private String name;
}
