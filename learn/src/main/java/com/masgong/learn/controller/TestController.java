package com.masgong.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masgong.learn.dto.response.BaseResponse;
import com.masgong.learn.service.TestService;

@RestController
public class TestController {
    
    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public BaseResponse test() {
        return testService.test();
    }

}
