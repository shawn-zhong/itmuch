package com.itmuch.cloud.userprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo {

    @GetMapping(value="/demo")
    public String demo() {
        return "demo string from springboot";
    }
}
