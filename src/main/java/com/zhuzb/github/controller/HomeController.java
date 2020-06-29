package com.zhuzb.github.controller;

import com.zhuzb.github.common.ResponseMessage;
import com.zhuzb.github.domain.Admin;
import com.zhuzb.github.service.HomeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: 朱政彬
 * @Date: 2020/6/19 23:01
 * @Description: 首页控制器
 */
@Api(tags = "首页控制器")
@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private HomeService homeService;

    @ApiOperation("欢迎接口")
    @GetMapping("/welcome")
    public ResponseMessage<String> welcome() {
        return ResponseMessage.success("欢迎访问");
    }

    @ApiOperation("查询所有管理员信息")
    @GetMapping("/queryAll")
    public ResponseMessage<List<Admin>> queryAll() {
        List<Admin> admins = homeService.queryAll();
        return ResponseMessage.success(admins);
    }
}
