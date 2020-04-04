package com.devisv.jwt.user.authentication.service.core;

import java.io.Serializable;

public interface EntityId <T> extends Serializable {

  T getId();

  String asString();

}
