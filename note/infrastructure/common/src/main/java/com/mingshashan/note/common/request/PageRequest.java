package com.mingshashan.note.common.request;

/**
 * page request
 */
public class PageRequest {
    private final int page;
    private final int size;

    public PageRequest(int page, int size) {

        if (page < 0) {
            throw new IllegalArgumentException("Page index must not be less than zero!");
        }

        if (size < 1) {
            throw new IllegalArgumentException("Page size must not be less than one!");
        }

        this.page = page;
        this.size = size;
    }

    public static PageRequest of(int page, int size) {
        return new PageRequest(page, size);
    }

    public int getPageSize() {
        return size;
    }

    public int getPageNumber() {
        return page;
    }

}
