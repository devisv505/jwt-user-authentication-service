package com.devisv.jwt.user.authentication.service.controller;

import com.devisv.jwt.user.authentication.service.exception.HttpException;
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
    ResponseEntity response = new ResponseEntity(exception, exception.getHttpStatus());
    return response;
  }

  @ExceptionHandler(RuntimeException.class)
  @ResponseBody
  public ResponseEntity<HttpException> processValidationError(RuntimeException exception) {
    return new ResponseEntity(
        new HttpException(INTERNAL_SERVER_ERROR, exception.getMessage(), exception), INTERNAL_SERVER_ERROR
    );
  }

}
