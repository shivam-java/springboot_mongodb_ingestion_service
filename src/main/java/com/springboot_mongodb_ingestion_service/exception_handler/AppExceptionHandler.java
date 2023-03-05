package com.springboot_mongodb_ingestion_service.exception_handler;

import com.mongodb.DuplicateKeyException;
import com.mongodb.MongoWriteException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class AppExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> handleInvalidArgumentException(MethodArgumentNotValidException methodArgumentNotValidException)
    {
        Map<String,String> errorMap=new HashMap<>();
        methodArgumentNotValidException.getBindingResult().getFieldErrors().forEach(
                err->
                        errorMap.put(err.getField(),err.getDefaultMessage())
        );
         return errorMap;
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MongoWriteException.class)
    public Map<String,String> handleDuplicateKey(MongoWriteException duplicateKeyException)
    {
        Map<String,String> errorMap=new HashMap<>();
       errorMap.put("duplicate", String.valueOf(duplicateKeyException.getError()));
        return errorMap;
    }
}

