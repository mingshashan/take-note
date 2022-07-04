package com.mingshashan.note.common.api;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ApiVersion {
    /**
     * 版本号
     *
     * @return 版本号
     */
    String version() default "";
}
