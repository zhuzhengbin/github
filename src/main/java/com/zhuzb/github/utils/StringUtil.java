package com.zhuzb.github.utils;

import java.util.UUID;

/**
 * @Author: 朱政彬
 * @Date: 2020/6/19 23:06
 * @Description:
 */
public class StringUtil {

    public static String uuid() {
        return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
    }
}
