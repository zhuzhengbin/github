package com.zhuzb.github.dao;

import com.zhuzb.github.domain.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: 朱政彬
 * @Date: 2020/6/19 23:06
 * @Description:
 */
@Repository
public interface HomeDao {

    void save(Admin admin);

    List<Admin> queryAll();
}
