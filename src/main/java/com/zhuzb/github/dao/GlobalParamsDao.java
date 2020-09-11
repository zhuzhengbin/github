package com.zhuzb.github.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author: 朱政彬
 * @Date: 2020/7/2 23:32
 * @Description: 全局参数接口
 */
@Repository
public interface GlobalParamsDao {

    /**
     * 根据键值获取参数
     * @param rootKey
     * @param subKey
     * @return
     */
    String getValue(String rootKey,String subKey);
}
