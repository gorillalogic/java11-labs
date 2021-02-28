package com.example.cartservice.exception;

public class QuantityNotEnoughException extends RuntimeException{
    public QuantityNotEnoughException(String message){
        super(message);
    }
}
