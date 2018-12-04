package com.ky.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.ky.service.MsgService;
import org.springframework.stereotype.Component;

/**
 * @ClassName DefenceBizServiceFallBack
 * @Author beyond
 * @Company KY
 * @Date 2018/12/4 17:10
 * @Descr
 */
@Component
public class DefenceBizServiceFallBack implements MsgService {
    @Override
    public String hello() {
        System.out.println("fallback..............");
        return JSONObject.toJSONString("调用远程服务失败！");
    }
}
