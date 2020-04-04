package com.devisv.jwt.user.authentication.service;

import com.devisv.jwt.user.authentication.service.core.UniqueIdGeneratorUuid;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class Config {

  @Bean
  public UniqueIdGeneratorUuid generator() {
    return new UniqueIdGeneratorUuid();
  }

}
