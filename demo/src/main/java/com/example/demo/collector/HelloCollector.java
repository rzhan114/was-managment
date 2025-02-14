package com.example.demo.collector;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class HelloCollector {
    @GetMapping
    public String hello() {
        return "hello";
    }
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> list() {
        return userService.listAll();
    }

}
