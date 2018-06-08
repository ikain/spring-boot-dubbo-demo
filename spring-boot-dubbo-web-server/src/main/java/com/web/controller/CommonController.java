package com.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.web.api.IDogService;
import com.web.api.IHelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by FengKai on 2018/6/8.
 * Consumer
 */
@RestController
public class CommonController {

    @Reference
    private IHelloService helloService;

    @Reference
    private IDogService dogService;

    @GetMapping("/sayHello")
    public Map<String, String> sayHello() {
        Map<String, String> map = new HashMap<>();
        map.put("key", helloService.toSayHello());
        return map;
    }

    @GetMapping("/eatFood")
    public Map<String, String> eatFood(@RequestParam String food) {
        return dogService.eatFood(food);
    }

}
