package com.net.lznvideo.video.controller;

import com.net.lznvideo.video.config.WeChatConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController{
    @RequestMapping("test")
    public String test() {
        return "hello lznclass.net";
    }

    @Autowired
    private WeChatConfig weChatConfig;
    @RequestMapping("test_config")
    public String testConfig() {
        System.out.println(weChatConfig.getAppId());
        System.out.println(weChatConfig.getAppsecret());
        return "hello xdclass.net";
    }
}