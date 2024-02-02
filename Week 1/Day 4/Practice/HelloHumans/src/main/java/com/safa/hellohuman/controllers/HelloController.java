package com.safa.hellohuman.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class HelloController {
        public static void main(String[] args) {
                SpringApplication.run(HelloController .class, args);
        }
        
@GetMapping("/")
        // 3. Method that maps to the request route above
        public String index() { // 3
                return "Hello World";
        }
@GetMapping("/name")

public String index1() { // 3
        return "Hello khoa ";
}
@GetMapping("/Lastname")

public String index2() { // 3
        return "Hello khoa Le ";
}
}

