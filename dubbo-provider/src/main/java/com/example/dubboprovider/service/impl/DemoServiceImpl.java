package com.example.dubboprovider.service.impl;

import com.example.dubboapi.service.IDemoService;
import org.springframework.stereotype.Service;

/**
 * @author xu
 * @date 2019-7-3
 */
@Service("demoServiceImpl")
public class DemoServiceImpl implements IDemoService {
    @Override
    public String getDemoString() {
        return "就LG啊结果垃圾狗我骄傲叫我哥";
    }
}
