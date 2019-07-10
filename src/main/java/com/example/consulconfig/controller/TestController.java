package com.example.consulconfig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

    // 读取远程配置
    @Value("${foo.bar.name}")
    private String name;

    // 读取远程配置
    @Value("${token}")
    private String token;

    // 将配置展示在页面
    @GetMapping("/getName")
    public String getName(){
        return name+token;
    }

}
