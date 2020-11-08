package com.a_linOnline.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2020.8.1
 * Author: limlin
 */
//标注一个主程序类，主入口类，说明这是一个Spring Boot应用
@SpringBootApplication
@RestController
public class DemoApplication {
    public static void main(String[] args) {
        //主程序类传入，spring应用启动起来
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}
            