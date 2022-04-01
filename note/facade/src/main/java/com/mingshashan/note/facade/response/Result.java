package com.mingshashan.note.facade.response;

/**
 * result module
 *
 * @param <T>
 * @author mingshashan
 */
public class Result<T> {

    private final static String DEFAULT_SUCCESS_MESSAGE = "ok";
    private final static String DEFAULT_SUCCESS_CODE = "ok";

    private String code;

    private String message;

    private T data;

    private Result(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    private Result(T data) {
        this.data = data;
    }

    /**
     * default ok method
     * message code:
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> ok(T data) {
        return new Result<>(DEFAULT_SUCCESS_CODE, DEFAULT_SUCCESS_MESSAGE, data);
    }
}
