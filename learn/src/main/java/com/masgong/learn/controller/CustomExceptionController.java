package com.masgong.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masgong.learn.dto.response.BaseResponse;
import com.masgong.learn.service.CustomExceptionService;

@RestController
public class CustomExceptionController {
 
    @Autowired
    private CustomExceptionService customExceptionService;

    @GetMapping("/aioob")
    public BaseResponse arrayIndexOutOfBounds() {
        return customExceptionService.arrayIndexOutOfBounds();
    }

    @GetMapping("/np")
    public BaseResponse nullPointer() {
        return customExceptionService.nullPointer();
    }
}
