package com.ky.controller;

import com.ky.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName InfoController
 * @Author beyond
 * @Company KY
 * @Date 2018/12/4 16:15
 * @Descr
 */
@RestController
public class InfoController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    MsgService msgService;

    @RequestMapping("/info")
    public String info(){
        String info = discoveryClient.description();
        return info;
    }

    @RequestMapping("/msg")
    public String getMsg(){
        String msg = msgService.hello();
        return "请求到的信息:" + msg;
    }
}
