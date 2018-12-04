package com.ky.service;

import com.ky.service.impl.DefenceBizServiceFallBack;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName MsgService
 * @Author beyond
 * @Company KY
 * @Date 2018/12/4 16:38
 * @Descr
 */
@FeignClient(name = "eureka-server" , fallback = DefenceBizServiceFallBack.class)
public interface MsgService {
    @RequestMapping("/getMsg")
    public String hello();
}
