package com.web;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 * 注：此Main服务是提供者
 */
@SpringBootApplication
@EnableDubboConfiguration // 启用Dubbo（用于提供者或消费者）的Spring启动应用程序
public class ServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(ServiceApp.class, args);
    }
}
