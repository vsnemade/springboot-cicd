package com.vishtech.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@SpringBootApplication
@RestController
@Slf4j
public class SpringBootCicd {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCicd.class, args);
    }

    @GetMapping("/")
    public String welcome(){
        log.info("Dummy: Request received for '/'");
        return "Welcome at "+LocalDateTime.now();
    }


    @GetMapping("/hello")
    public String hello(){
        log.info("Request received for '/hello'");
        return "Hello at "+LocalDateTime.now();
    }

    @GetMapping("/health")
    public ResponseEntity<String> health(){
        log.info("Request received for '/health'");
        return ResponseEntity.ok("Demo Application is healthy");
    }

}
