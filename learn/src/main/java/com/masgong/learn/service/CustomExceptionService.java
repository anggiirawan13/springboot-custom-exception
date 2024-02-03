package com.masgong.learn.service;

import java.util.ArrayList;

import org.springframework.http.HttpMessage;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.masgong.learn.dto.response.BaseResponse;
import com.masgong.learn.handler.BaseExceptionHander;

@Service
public class CustomExceptionService {

    public BaseResponse arrayIndexOutOfBounds() {
        try {
            String data = "a~b~c~d~e";
            String arrData[] = data.split("~");
            String result = arrData[5];

            return new BaseResponse(HttpStatus.OK.value(), "DATA_FOUND", result);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new BaseExceptionHander("ARRAY_INDEX_OUT_OF_BOUNDS", e);
        }
    }

    public BaseResponse nullPointer() {
        try {
            ArrayList<String> listData = null;
            String result = listData.get(0);

            return new BaseResponse(HttpStatus.OK.value(), "DATA_FOUND", result);
        } catch (NullPointerException e) {
            throw new BaseExceptionHander("NULL_POINTER_EXCEPTION", e);
        }
    }

}
