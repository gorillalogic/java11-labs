package com.ws.spring.cartservice.exception;

public class QuantityNotEnoughException extends RuntimeException{
    public QuantityNotEnoughException(String message){
        super(message);
    }
}
