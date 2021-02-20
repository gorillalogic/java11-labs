package com.ws.spring.cartservice.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity HandleEntityNotFoundException(HttpServletRequest request, final EntityNotFoundException exception){
        log.error("Entity not found", exception);
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(QuantityNotEnoughException.class)
    public ResponseEntity HandleQuantityNotEnoughException(HttpServletRequest request, final  QuantityNotEnoughException exception){
        log.error("Quantity not enough", exception);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}
