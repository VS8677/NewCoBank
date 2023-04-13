package com.fsobe.newcobank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HealthCheckController {

    @GetMapping("/health")
    public String heathCheck() {
        return "NewCo App is up at " + LocalDateTime.now();
    }

}
