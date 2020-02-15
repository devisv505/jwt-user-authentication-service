package com.devisv.jwt.user.authentication.service.exception;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import org.springframework.http.HttpStatus;

@JsonIgnoreProperties({"message", "localizedMessage", "stackTrace", "suppressed", "cause", "args", "messageKey", "stackTrace"})
public class HttpException extends RuntimeException {

  @JsonIgnore
  private HttpStatus httpStatus;

  @JsonProperty("exception")
  private String localizedMessage;

  @JsonProperty("body")
  private Map<String, Object> body;

  public HttpException(HttpStatus httpStatus, String message, Throwable cause, Map<String, Object> body) {
    super(message, cause);
    this.httpStatus = httpStatus;
    this.localizedMessage = message;
    this.body = body;
  }

  public HttpException(HttpStatus httpStatus, String message, Throwable cause) {
    super(message, cause);
    this.httpStatus = httpStatus;
    this.localizedMessage = message;
  }

  public Map<String, Object> getBody() {
    return body;
  }

  @JsonProperty("status")
  public int getStatus() {
    return httpStatus.value();
  }

  public HttpStatus getHttpStatus() {
    return httpStatus;
  }

  @Override
  public String getLocalizedMessage() {
    return localizedMessage;
  }
}
