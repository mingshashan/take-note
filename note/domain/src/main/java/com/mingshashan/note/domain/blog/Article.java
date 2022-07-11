package com.mingshashan.note.domain.blog;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Article
 *
 * @author mingshashan
 */
@Setter
@Getter
public class Article {

    /**
     * id
     */
    private String id;

    /**
     * 作者id
     */
    private Author author;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 背景图
     */
    private String backgroundImage;

    /**
     * 标签
     */
    private List<Tag> tagList;

    /**
     * 类别
     */
    private List<Category> categoryList;

}
