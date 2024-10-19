package com.rabin.banking_system_project.handler;

import com.rabin.banking_system_project.exception.CustomerAlreadyExistException;

import com.rabin.banking_system_project.exception.CustomerNotPresentException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.http.HttpClient;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionHandlerClass {

    @ExceptionHandler(CustomerAlreadyExistException.class)
    private ResponseEntity<Map<String, String>> exceptionHandlingIfCustomerAlreadyExistException(CustomerAlreadyExistException ex) {
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("Message", ex.getMessage());
        errorMap.put("Status Code", HttpStatus.ALREADY_REPORTED.toString());
        return ResponseEntity.ok(errorMap);

    }

    @ExceptionHandler(CustomerNotPresentException.class)
    private ResponseEntity<Map<String, String>> exceptionHandlingIfCustomerNotPresentException(CustomerNotPresentException ex) {
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("Message", ex.getMessage());
        errorMap.put("Status Code", HttpStatus.ALREADY_REPORTED.toString());
        return ResponseEntity.ok(errorMap);

    }
}
