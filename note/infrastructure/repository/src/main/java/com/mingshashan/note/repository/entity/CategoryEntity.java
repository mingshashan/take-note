package com.mingshashan.note.repository.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * category entity
 */
@Getter
@Setter
public class CategoryEntity extends BaseEntity {
    /**
     * 目录名
     */
    private String name;
}
