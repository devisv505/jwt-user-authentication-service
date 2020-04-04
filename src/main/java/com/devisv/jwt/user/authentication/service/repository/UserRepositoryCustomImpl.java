package com.devisv.jwt.user.authentication.service.repository;

import com.devisv.jwt.user.authentication.service.core.UniqueIdGeneratorUuid;
import com.devisv.jwt.user.authentication.service.model.UserId;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRepositoryCustomImpl implements UserRepositoryCustom {

  private final UniqueIdGeneratorUuid uniqueIdGenerator;

  @Autowired
  public UserRepositoryCustomImpl(UniqueIdGeneratorUuid uniqueIdGenerator) {
    this.uniqueIdGenerator = uniqueIdGenerator;
  }

  @Override
  public UserId next() {
    return new UserId(uniqueIdGenerator.next());
  }
}
