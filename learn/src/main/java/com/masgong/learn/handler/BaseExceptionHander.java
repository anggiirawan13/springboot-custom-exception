package com.masgong.learn.handler;

public class BaseExceptionHander extends RuntimeException {

    public BaseExceptionHander(String message, Throwable throwable) {
        super(message, throwable);
    }

}
