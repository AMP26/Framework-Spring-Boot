package com.springboot.rest.globalexceptionhandling.rest;

import com.springboot.rest.globalexceptionhandling.exception.BookErrorResponse;
import com.springboot.rest.globalexceptionhandling.exception.BookNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BookRestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<BookErrorResponse> handleException(BookNotFoundException exc) {
        BookErrorResponse err = new BookErrorResponse();

        err.setStatus(HttpStatus.NOT_FOUND.value());
        err.setMessage(exc.getMessage());
        err.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(err, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<BookErrorResponse> handleException(Exception exc) {
        BookErrorResponse err = new BookErrorResponse();

        err.setStatus(HttpStatus.BAD_REQUEST.value());
//        err.setMessage(exc.getMessage());
        err.setMessage("Invalid Book ID Requested!");
        err.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }
}
