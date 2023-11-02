package com.techie.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class TechieApplication {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome Techie";
    }

    public static void main(String[] args) {
        SpringApplication.run(TechieApplication.class, args);
    }

}
