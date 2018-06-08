package com.web.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.web.api.IHelloService;
import org.springframework.stereotype.Component;

/**
 * Created by FengKai on 2018/6/8.
 * Provider 实现
 */
@Service(interfaceClass = IHelloService.class)
@Component
public class HelloServiceImpl implements IHelloService {

    @Override
    public String toSayHello() {
        return "Hello World";
    }
}
