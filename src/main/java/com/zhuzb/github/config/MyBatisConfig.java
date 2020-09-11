package com.zhuzb.github.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 朱政彬
 * @Date: 2020/6/29 22:42
 * @Description: MyBatis配置类
 */
@Configuration
@MapperScan("com.zhuzb.github.dao")  // 扫描dao层接口的路径
public class MyBatisConfig {
}
