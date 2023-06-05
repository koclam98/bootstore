package com.myweb.springbootstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RauteController {

    @GetMapping("/main")
    public String main() {
        return "Spring Boot Run Success!";
    }

}
