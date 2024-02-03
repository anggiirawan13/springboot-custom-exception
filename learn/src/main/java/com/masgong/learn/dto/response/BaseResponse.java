package com.masgong.learn.dto.response;

public class BaseResponse {

    private int statusCode;
    private String message;
    private Object data;
    private Object additionalEntity;

    public BaseResponse() {

    }

    public BaseResponse(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public BaseResponse(int statusCode, String message, Object data) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }

    public BaseResponse(int statusCode, String message, Object data, Object additionalEntity) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
        this.additionalEntity = additionalEntity;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getAdditionalEntity() {
        return additionalEntity;
    }

    public void setAdditionalEntity(Object additionalEntity) {
        this.additionalEntity = additionalEntity;
    }

}
