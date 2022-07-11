package com.mingshashan.note.domain.admin;

import lombok.Getter;
import lombok.Setter;

/**
 * user
 *
 * @author mingshashan
 */
@Setter
@Getter
public class User {

    /**
     * id
     */
    private Long id;

    /**
     * name
     */
    private String name;

    /**
     * email
     */
    private String email;
}
