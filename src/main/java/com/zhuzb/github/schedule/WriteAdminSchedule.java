package com.zhuzb.github.schedule;

import com.zhuzb.github.domain.Admin;
import com.zhuzb.github.mapper.GlobalParamsMapper;
import com.zhuzb.github.mapper.HomeMapper;
import com.zhuzb.github.utils.DateUtil;
import com.zhuzb.github.utils.StringUtil;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@RequiredArgsConstructor
public class WriteAdminSchedule {

    private static final Logger log = LoggerFactory.getLogger(WriteAdminSchedule.class);

    private final HomeMapper homeMapper;
    private final GlobalParamsMapper paramsMapper;


    /**
     * 每10s写入一次
     */
    @Scheduled(fixedRate = 1000 * 5)
    public void writeAdminInfo() {
        // 设置一个开关，只有在启用的时候才调用
        String value = paramsMapper.getValue("writeAdminInfo", "switch");
        if ("1".equals(value)) {
            // 具体定时任务写入到service中
            Admin admin = new Admin();
            admin.setUsername(DateUtil.currentTimeStr());
            admin.setPassword(StringUtil.uuid().substring(0, 10));
            homeMapper.save(admin);
            log.info("写入数据库成功");
        } else {
            System.out.println("定时任务未开启");
        }

    }
}
