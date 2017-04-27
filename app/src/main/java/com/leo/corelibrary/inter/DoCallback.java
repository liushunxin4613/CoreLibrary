package com.leo.corelibrary.inter;

/**
 * 有参回调
 */
public interface DoCallback<T> {
    /**
     * 有参回调
     */
    <T> void execute(T obj);
}
