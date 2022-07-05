package com.mingshashan.note.common.request;

/**
 * page request
 *
 * @author mingshashan
 */
public class PageRequest<T> {
    /**
     * page
     */
    private final int page;
    /**
     * size
     */
    private final int size;

    T param;

    public PageRequest(T param, int page, int size) {

        if (page < 0) {
            throw new IllegalArgumentException("Page index must not be less than zero!");
        }

        if (size < 1) {
            throw new IllegalArgumentException("Page size must not be less than one!");
        }

        this.param = param;
        this.page = page;
        this.size = size;
    }

    public static <T> PageRequest of(T param, int page, int size) {
        return new PageRequest(param, page, size);
    }

    public int getSize() {
        return size;
    }

    public int getPage() {
        return page;
    }

}
