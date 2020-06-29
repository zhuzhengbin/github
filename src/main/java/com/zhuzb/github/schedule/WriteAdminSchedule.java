package com.zhuzb.github.schedule;

import com.zhuzb.github.domain.Admin;
import com.zhuzb.github.mapper.HomeMapper;
import com.zhuzb.github.utils.DateUtil;
import com.zhuzb.github.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author: 朱政彬
 * @Date: 2020/6/29 23:24
 * @Description: 写入新用户的Schedule
 */
@Component
@EnableScheduling
public class WriteAdminSchedule {

    @Autowired
    HomeMapper homeMapper;


    /**
     * 每10s写入一次
     */
    @Scheduled(fixedRate = 1000 * 5)
    public void writeAdminInfo() {
        Admin admin = new Admin();
        admin.setUsername(DateUtil.currentTimeStr());
        admin.setPassword(StringUtil.uuid().substring(0, 10));
        homeMapper.save(admin);
    }
}
