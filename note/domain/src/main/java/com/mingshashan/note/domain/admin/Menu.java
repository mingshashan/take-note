package com.mingshashan.note.domain.admin;

import lombok.Getter;
import lombok.Setter;

/**
 * menu
 *
 * @author mingshashan
 */
@Getter
@Setter
public class Menu {

    /**
     * id
     */
    private Long id;

    /**
     * code
     */
    private String code;

    /**
     * name
     */
    private String name;

    /**
     * 层级
     */
    private int level;

    /**
     * parent code
     */
    private String parentCode;

    /**
     * 是否是叶子节点
     */
    private boolean isLeaf;
}
