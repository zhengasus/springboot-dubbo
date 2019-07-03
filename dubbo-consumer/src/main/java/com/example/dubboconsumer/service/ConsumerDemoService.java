package com.example.dubboconsumer.service;

import com.example.dubboapi.service.IDemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xu
 * @date 2019-7-4
 */
@Service("consumerDemoService")
public class ConsumerDemoService {

    @Resource
    private IDemoService demoService;

    public void demoString(String name) {
        // 执行消费远程方法
        String hello = demoService.getDemoString();
        System.out.println(hello);
    }

}
