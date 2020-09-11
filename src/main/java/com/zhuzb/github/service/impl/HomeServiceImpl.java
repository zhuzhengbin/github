package com.zhuzb.github.service.impl;

import com.zhuzb.github.domain.Admin;
import com.zhuzb.github.dao.HomeDao;
import com.zhuzb.github.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 朱政彬
 * @Date: 2020/6/19 23:05
 * @Description:
 */
@Service
@RequiredArgsConstructor
public class HomeServiceImpl implements HomeService {
    private final HomeDao homeDao;

    @Override
    public List<Admin> queryAll() {
        return homeDao.queryAll();
    }
}
