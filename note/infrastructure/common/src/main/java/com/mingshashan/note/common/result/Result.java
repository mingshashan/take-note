package com.mingshashan.note.common.result;

import lombok.Builder;

/**
 * result module
 *
 * @param <T>
 * @author mingshashan
 */
@Builder
public class Result<T> {

    /**
     * http status
     *
     * @see HttpStatus
     */
    private int status;

    /**
     * response code
     *
     * @see ResponseCode
     */
    private String code;

    /**
     * response message
     *
     * @see ResponseCode
     */
    private String message;

    /**
     * data
     */
    private T data;

    private Result(int status, String code, String message, T data) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * default ok method
     * message code:
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> ok(T data) {
        return new Result<>(
                HttpStatus.SC_OK,
                ResponseCode.OK.getCode(),
                ResponseCode.OK.getMessage(),
                data);
    }
}
