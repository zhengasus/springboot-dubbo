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
        System.out.println("---provider被调用了");
        return "provider被调用了";
    }
}
