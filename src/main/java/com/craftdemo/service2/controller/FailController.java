package com.craftdemo.service2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.AccessDeniedException;

@RestController
@RequestMapping("/service2")
public class FailController {
    @GetMapping("/fail")
    public String failApi() {
        return "Fail";
    }
}