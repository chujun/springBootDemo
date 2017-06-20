package com.chujun.spring.boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * Created by chujun on 2017/6/20.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        /**
         * 百分百纯java代码,无xml配置,
         * web.xml也没有
         */
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext context){
        return args -> {
            System.out.println("Let's inspect the beans provided by Spring Boot:");
            String[] beanNames = context.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for(String beanName : beanNames) System.out.println(beanName);
        };
    }

}
