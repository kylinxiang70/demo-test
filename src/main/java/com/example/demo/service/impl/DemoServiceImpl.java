package com.example.demo.service.impl;

import com.example.demo.constant.HelloConst;
import com.example.demo.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    public String sayHello() {
        if (System.currentTimeMillis() % 2 == 0) {
            doSomething();
        }
        return HelloConst.HELLO_WORLD;
    }

    private void doSomething() {
        System.out.println("do something");
    }
}
