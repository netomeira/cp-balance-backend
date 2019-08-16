package com.cpbalance.cpbalancebackend.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class WebRestControllerAdvice {

    @ExceptionHandler(InternalErrorException.class)
    public ResponseEntity<String> handleInternalErrorException(InternalErrorException e){
        return new ResponseEntity<>(e.RESPONSE_TEXT, e.RESPONSE_STATUS);
    }

    @ExceptionHandler(NoContentException.class)
    public ResponseEntity<String> handleNoContentException(NoContentException e){
        return new ResponseEntity<>(e.RESPONSE_TEXT, e.RESPONSE_STATUS);
    }

}
