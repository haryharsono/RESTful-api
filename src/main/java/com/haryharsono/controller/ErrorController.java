package com.haryharsono.controller;

import com.haryharsono.model.webResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;

@RestControllerAdvice
public class ErrorController {

    @ExceptionHandler(value = ConstraintViolationException.class)
    private webResponse<String> validationHandler(ConstraintViolationException constraintViolationException) {
        return new webResponse(400,"Bad Request", constraintViolationException.getMessage());

    }
}
