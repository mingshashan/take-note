package com.mingshashan.note.domain.blog;


import java.util.List;

/**
 * Article
 *
 * @author mingshashan
 */
public class Article {

    private String id;

    private String name;

    private String author;

    private String title;

    private String backgroundImage;

    private String content;

    private List<Tag> tagList;

    private List<Category> categoryList;

}
