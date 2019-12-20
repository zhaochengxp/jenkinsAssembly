package com.dfssi.zhaocheng.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: jenkinsAssembly
 * @description: 接口测试
 * @author: zhaocheng
 * @create: 2019-12-20 09:03
 * @version: 1.0
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/test1")
    public String test1(){
        return "接口测试";
    }

    @GetMapping("/test2")
    public String test2(){
        return "jenkins接口测试";
    }

}
