package com.devisv.jwt.user.authentication.service.core;

import java.util.UUID;

public class UniqueIdGeneratorUuid {

  public UUID next() {
    return UUID.randomUUID();
  }
}
