package com.mingshashan.note.repository.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mingshashan.note.domain.blog.Category;
import com.mingshashan.note.domain.blog.Tag;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author mingshashan
 */
@TableName("note_article")
@Setter
@Getter
public class ArticleEntity extends BaseEntity{

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @TableField("name")
    private String name;

    private String author;

    private String title;

    private String backgroundImage;

    @TableField("content")
    private String content;

    private List<Tag> tagList;

    private List<Category> categoryList;
}
