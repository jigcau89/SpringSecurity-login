package com.example.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
//import org.springframework.security.access.SecurityConfig;

import com.example.auth.config.SecurityConfig;

@Configuration
@Import({SecurityConfig.class})
@SpringBootApplication
public class SegurityProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SegurityProjectApplication.class, args);
    }

}
