package com.devisv.jwt.user.authentication.service.controller;

import com.devisv.web.exceptions.HttpException;
import com.devisv.web.exceptions.InternalSeverErrorException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@ControllerAdvice
public class RestErrorHandler {

  @ExceptionHandler(HttpException.class)
  @ResponseBody
  public ResponseEntity<HttpException> processValidationError(HttpException exception) {
    ResponseEntity response = new ResponseEntity(exception, HttpStatus.valueOf(exception.getStatus()));
    return response;
  }

  @ExceptionHandler(RuntimeException.class)
  @ResponseBody
  public ResponseEntity<HttpException> processValidationError(RuntimeException exception) {
    return new ResponseEntity(
        new InternalSeverErrorException(exception.getMessage(), exception),
        INTERNAL_SERVER_ERROR
    );
  }

}
