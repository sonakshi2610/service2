package com.craftdemo.service2.controller;

import com.craftdemo.requestfilter.RequestContext;
import com.craftdemo.requestfilter.ResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.AccessDeniedException;

@RestController
@RequestMapping("/service2/fail")
public class FailController {
    @GetMapping
    public ResponseDto<String> failApi() {
        return ResponseDto.<String>builder()
                .data("Fail")
                .correlationId(RequestContext.getTraceId())
                .build();
    }
}
