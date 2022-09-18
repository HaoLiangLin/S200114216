package com.gdsdxy.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVo {
    private Integer code;
    private Object data;
    private String message;

    public static ResultVo ok() {
        return new ResultVo(ResultCode.SUCCESS.getCode(), null, null);
    }

    public static ResultVo ok(Object data) {
        return new ResultVo(ResultCode.SUCCESS.getCode(), data, null);
    }

    public static ResultVo ok(Object data, String message) {
        return new ResultVo(ResultCode.SUCCESS.getCode(), data, message);
    }

    public static ResultVo failed(String message) {
        return new ResultVo(ResultCode.FAILED.getCode(), null, message);
    }

    public static ResultVo failed(Integer code, String message) {
        return new ResultVo(code, null, message);
    }
}
