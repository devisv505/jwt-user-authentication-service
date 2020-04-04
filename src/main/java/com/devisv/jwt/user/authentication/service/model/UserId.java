package com.devisv.jwt.user.authentication.service.model;

import com.devisv.jwt.user.authentication.service.core.AbstractEntityId;
import java.util.UUID;

public class UserId extends AbstractEntityId<UUID> {

  protected UserId() {
  }

  public UserId(UUID id) {
    super(id);
  }
}
