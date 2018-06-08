package com.web;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 注：此Main服务是消费者
 */
@SpringBootApplication(scanBasePackages = "com.web.controller")
@EnableDubboConfiguration // 启用Dubbo（用于提供者或消费者）的Spring启动应用程序
public class WebServerApp {
    public static void main(String[] args) {
        SpringApplication.run(WebServerApp.class, args);
    }
}
