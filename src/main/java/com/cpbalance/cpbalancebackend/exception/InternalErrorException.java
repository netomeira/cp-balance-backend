package com.cpbalance.cpbalancebackend.exception;

import org.springframework.http.HttpStatus;

public class InternalErrorException extends RuntimeException {

    public static final String RESPONSE_TEXT = "An unexpected error occured on the server.";
    public static final HttpStatus RESPONSE_STATUS = HttpStatus.INTERNAL_SERVER_ERROR;
}
