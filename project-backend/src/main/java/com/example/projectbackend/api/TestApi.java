package com.example.projectbackend.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {

    @GetMapping
    public String testAPI() {
        return "test입니다.";
    }

}
