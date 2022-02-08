package com.mingshashan.note.facade.response;

public class Result<T> {

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


}
