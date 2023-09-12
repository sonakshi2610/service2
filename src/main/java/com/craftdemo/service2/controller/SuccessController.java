package com.craftdemo.service2.controller;

import com.craftdemo.requestfilter.RequestContext;
import com.craftdemo.requestfilter.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service2/success")
@Slf4j
public class SuccessController {
    @GetMapping
    public ResponseDto<String> successApi() throws Exception {
        log.info("Request came for Success");
        return ResponseDto.<String>builder()
                .data("Success")
                .correlationId(RequestContext.getTraceId())
                .build();
    }

}
