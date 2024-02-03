package com.masgong.learn.service;

import org.springframework.stereotype.Service;

import com.masgong.learn.dto.response.BaseResponse;

@Service
public class TestService {
    
    public BaseResponse test() {
        return new BaseResponse(200, "TEST_API_SUCCESS");
    }

}
