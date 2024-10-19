package com.rabin.banking_system_project.exception;

public class CustomerNotPresentException extends RuntimeException {
    public CustomerNotPresentException(String message){
        super(message);
    }

}
