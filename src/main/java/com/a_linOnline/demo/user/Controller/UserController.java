package com.a_linOnline.demo.user.Controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

//    @Value("${person.last-name}")
//    private String name;

    @RequestMapping("/login")
    public String sayHello() {
//        return "hello "+ name;
        return "hello ";
    }
}
