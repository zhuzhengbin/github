package com.zhuzb.github.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: 朱政彬
 * @Date: 2020/6/19 23:05
 * @Description:
 */
public class DateUtil {

    // 生成yyMMddhhmmss格式的当前时间串
    public static long currentTimeStr() {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMddhhmmss");
        String timeStr = dateFormat.format(now);
        return Long.parseLong(timeStr);
    }

    public static void main(String[] args) {
        System.out.println(currentTimeStr());
    }
}
