package com.zhuzb.github.controller;

import com.zhuzb.github.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 朱政彬
 * @Date: 2020/6/19 23:01
 * @Description: 首页控制器
 */
@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private HomeService homeService;

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome";
    }
}
