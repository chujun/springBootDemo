package com.chujun.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chujun on 2017/6/17.
 */
@RestController
public class SampleController {
    @RequestMapping("/")
    public String home() {
        return "Greetings from Spring Boot!";
    }
}
