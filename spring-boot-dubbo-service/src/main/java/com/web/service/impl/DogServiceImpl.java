package com.web.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.web.api.IDogService;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by FengKai on 2018/6/8.
 * Provider 实现
 */
@Service(interfaceClass = IDogService.class)
@Component
public class DogServiceImpl implements IDogService {

    @Override
    public Map<String, String> eatFood(String food) {
        Map<String, String> map = new HashMap<>();
        map.put("key", "I'm full of " + food);
        return map;
    }
}
