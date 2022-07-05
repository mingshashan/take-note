package com.mingshashan.note.common.result;

import org.springframework.data.util.Streamable;

public interface Page<T> extends Streamable<T> {
    int DEFAULT_PAGE_SIZE = 20;

    int getPage();

    int getSize();

    int getTotalPages();

    /**
     * @return 总数
     */
    long getTotal();

    boolean isFirst();

    boolean isLast();
}
