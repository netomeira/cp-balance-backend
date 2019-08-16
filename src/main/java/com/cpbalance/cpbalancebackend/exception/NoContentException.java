package com.cpbalance.cpbalancebackend.exception;

import org.springframework.http.HttpStatus;

public class NoContentException extends RuntimeException{

    public static final String RESPONSE_TEXT = "The resource was not found.";
    public static final HttpStatus RESPONSE_STATUS = HttpStatus.NO_CONTENT;
}
