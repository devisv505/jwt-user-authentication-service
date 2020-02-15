package com.devisv.jwt.user.authentication.service.exception;

public class UserNotFound extends NotFoundException {

  private Long id;

  public UserNotFound(Long id) {
    super(String.format("User with id %s not found", id));

    this.id = id;
  }

  public Long getId() {
    return id;
  }
}
