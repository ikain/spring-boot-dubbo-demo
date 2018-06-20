package com.web;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.web.config.MongoConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Hello world!
 * 注：此Main服务是提供者
 */
@SpringBootApplication
@EnableDubboConfiguration // 启用Dubbo（用于提供者或消费者）的Spring启动应用程序
@Import({MongoConfig.class})
public class ServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(ServiceApp.class, args);
    }
}
