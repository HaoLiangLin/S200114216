package com.gdsdxy.dto;

public enum ResultCode implements StatusCode{
    SUCCESS(20011, "请求成功"),
    FAILED(20010, "请求失败");

    private Integer code;
    private String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
