package com.zhuzb.github.service;

import com.zhuzb.github.domain.Admin;

import java.util.List;

/**
 * @Author: 朱政彬
 * @Date: 2020/6/19 23:05
 * @Description: 首页服务接口
 */
public interface HomeService {
    List<Admin> queryAll();
}
