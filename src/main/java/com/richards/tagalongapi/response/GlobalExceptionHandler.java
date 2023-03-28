package com.richards.tagalongapi.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<BaseResponse> errorMessage(IllegalArgumentException ex) {
        BaseResponse baseResponse = new BaseResponse(ResponseCodeEnum.ERROR.getCode(), ResponseCodeEnum.ERROR.name());
        return new ResponseEntity<>(baseResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<BaseResponse> errorMessage(MethodArgumentNotValidException ex) {
        String[] errorMessages  = ex.getMessage().split("\\[");
        String message = errorMessages[errorMessages.length - 1];

        BaseResponse baseResponse = new BaseResponse(ResponseCodeEnum.ERROR.getCode(), message.substring(0, message.length() - 3));
        return new ResponseEntity<>(baseResponse, HttpStatus.BAD_REQUEST);
    }

}
