package com.zhuzb.github.common;

import lombok.Data;

/**
 * @Author: 朱政彬
 * @Date: 2020/6/29 21:55
 * @Description: 返回给前端的消息体封装
 */
@Data
public class ResponseMessage<T> {
    /**
     * 返回码，200表示正常，其他表示有错误
     */
    private Integer code;

    /**
     * 提示消息
     */
    private String message;

    /**
     * 数据
     */
    private T data;

    public ResponseMessage(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 默认成功返回对象
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseMessage<T> success(T data) {
        return new ResponseMessage<>(StatusCode.SUCCESS.getCode(), StatusCode.SUCCESS.getDes(), data);
    }

    /**
     * 默认失败返回对象
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseMessage<T> failure(T data) {
        return new ResponseMessage<>(StatusCode.FAILURE.getCode(), StatusCode.FAILURE.getDes(), data);
    }

}
