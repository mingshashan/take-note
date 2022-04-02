package com.mingshashan.note.common.result;

/**
 * @author mingshashan
 */
public enum ResponseCode {
    OK("ok", "2000000000");

    private String code;
    private String message;

    private ResponseCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
