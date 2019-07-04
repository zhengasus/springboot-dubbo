package com.example.dubboconsumer;

import com.example.dubboapi.service.IDemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author xu
 * @date 2019-7-4
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DubboConsumerApplication.class)
public class TestConsumer {
    @Resource
    private IDemoService demoService;

    @Test
    public void sayHello() {
        demoService.getDemoString();
    }
}
