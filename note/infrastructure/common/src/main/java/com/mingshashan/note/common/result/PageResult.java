package com.mingshashan.note.common.result;

import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * page result
 *
 * @param <T>
 */
public class PageResult<T> implements Page<T> {

    /**
     * 页码，0表示第一页
     */
    private int page;
    /**
     * 每页结果数
     */
    private int size;

    /**
     * 总页数
     */
    private int totalPage;

    /**
     * 总数
     */
    private long total = 0;

    private final List<T> content = new ArrayList<>();

    public static PageResult empty() {
        return new PageResult(null, 0, 0, 0);
    }

    public PageResult(List<T> content, int page, int size, long total) {
        this.content.addAll(content);
        this.page = Math.max(page, 0);
        this.size = size <= 0 ? DEFAULT_PAGE_SIZE : size;
        this.total = total;
    }

    @Override
    public int getPage() {
        return page;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getTotalPages() {
        return getSize() == 0 ? 1 : (int) Math.ceil((double) total / (double) getSize());
    }

    /**
     * @return 总数
     */
    @Override
    public long getTotal() {
        return total;
    }

    @Override
    public boolean isFirst() {
        return this.page == 0;
    }

    @Override
    public boolean isLast() {
        return this.page >= (this.totalPage - 1);
    }

    @Override
    public Iterator iterator() {
        return content.iterator();
    }

    public <U> Page<U> map(Function<? super T, ? extends U> converter) {
        return new PageResult<>(getConvertedContent(converter), page, size, total);
    }

    protected <U> List<U> getConvertedContent(Function<? super T, ? extends U> converter) {

        Assert.notNull(converter, "Function must not be null!");

        return this.stream().map(converter::apply).collect(Collectors.toList());
    }

}
