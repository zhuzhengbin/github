package com.zhuzb.github.common;

/**
 * @Author: 朱政彬
 * @Date: 2020/6/29 22:24
 * @Description: 状态码
 */
public enum StatusCode {

    SUCCESS(200,"请求成功"),
    FAILURE(400,"请求失败");

    private final int code;
    private final String des;

    StatusCode(int code, String des) {
        this.code = code;
        this.des = des;
    }

    public int getCode() {
        return code;
    }

    public String getDes() {
        return des;
    }
}
