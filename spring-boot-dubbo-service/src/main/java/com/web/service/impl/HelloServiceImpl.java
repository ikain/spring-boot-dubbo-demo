package com.web.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.web.api.IHelloService;
import org.springframework.stereotype.Component;

/**
 * Created by FengKai on 2018/6/8.
 * Provider 实现
 * 测试中发现，提供者的方法会被调用多次，最后查到原因如下：
 * 当Dubbo发现调用提供者的时候，有时间延迟的话，就会切换到下一个提供者，而假如说在本地调试的时候，
 * 只有一个提供者，就会尝试重复3次的调用，所以，在提供者打断点或响应缓慢的时候可能会出现3次执行导致数据问题
 * 可以通过在提供者的 @Service中增加timeout来解决这个问题
 * 不过这个正常Dubbo的思想就是快速响应，不成就切换下一个以保证分布式的快速响应和速度。
 */
@Service(interfaceClass = IHelloService.class, timeout = 10000)
@Component
public class HelloServiceImpl implements IHelloService {

    @Override
    public String toSayHello() {
        return "Hello World";
    }
}
