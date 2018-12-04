package com.ky.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ServerController
 * @Author beyond
 * @Company KY
 * @Date 2018/12/4 16:36
 * @Descr
 */
@RestController
public class ServerController {
    @RequestMapping("/getMsg")
    public String hello(){
        return "hello!";
    }
}
