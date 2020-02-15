package com.devisv.jwt.user.authentication.service.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends HttpException {

  private static final HttpStatus STATUS_CODE = HttpStatus.NOT_FOUND;

  public NotFoundException(String message) {
    this(message, null);
  }

  public NotFoundException(String message, Throwable cause) {
    super(STATUS_CODE, message, cause);
  }

}
