package com.harlankuo.hyacinth.wcms.utils;

import java.util.Iterator;
import java.util.List;

/**
 * 与具体ORM实现无关的分页查询结果封装.
 *
 * @param <T> Page中记录的类型.
 */
public class Page<T> implements Iterable<T> {
    protected List<T> rows = null;
    protected long total = -1;

    public Page() {
    }

    /**
     * 获得页内的记录列表.
     */
    public List<T> getRows() {
        return rows;
    }

    /**
     * 设置页内的记录列表.
     */
    public void setRows(final List<T> rows) {
        this.rows = rows;
    }

    /**
     * 获得总记录数, 默认值为-1.
     */
    public long getTotal() {
        return total;
    }

    /**
     * 设置总记录数.
     */
    public void setTotal(final long total) {
        this.total = total;
    }

    /**
     * 实现Iterable接口, 可以for(Object item : page)遍历使用
     */
    public Iterator<T> iterator() {
        return rows.iterator();
    }

   

}
