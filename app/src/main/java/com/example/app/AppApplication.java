package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppApplication {
    @GetMapping("/")
    public String index() {
        return "hello, world";
    }

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }

}
