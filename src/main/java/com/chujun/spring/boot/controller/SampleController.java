package com.chujun.spring.boot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chujun on 2017/6/17.
 */
@Controller
@EnableAutoConfiguration
public class SampleController {
    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World!";
    }

    public static void main(String[] args){
        SpringApplication.run(SampleController.class,args);
    }
}
