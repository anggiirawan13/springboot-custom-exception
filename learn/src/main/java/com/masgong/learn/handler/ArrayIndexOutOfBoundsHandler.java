package com.masgong.learn.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.masgong.learn.dto.response.BaseResponse;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class ArrayIndexOutOfBoundsHandler {

    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    public BaseResponse arrayIndexOutOfBoundsHandler(Throwable throwable, HttpServletRequest request) {
        BaseResponse response = new BaseResponse(HttpStatus.BAD_REQUEST.value(), throwable.getMessage(),
                request.getRequestURI(), request.getRequestURL());

        return response;
    }

}
