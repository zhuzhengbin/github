package com.zhuzb.github.mapper;

import com.zhuzb.github.domain.Admin;

import java.util.List;

/**
 * @Author: 朱政彬
 * @Date: 2020/6/19 23:06
 * @Description:
 */
public interface HomeMapper {

    void save(Admin admin);

    List<Admin> queryAll();
}
