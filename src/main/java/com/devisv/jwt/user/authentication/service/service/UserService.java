package com.devisv.jwt.user.authentication.service.service;

import com.devisv.jwt.user.authentication.service.exception.UserNotFound;
import com.devisv.jwt.user.authentication.service.model.User;
import com.devisv.jwt.user.authentication.service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

  private final UserRepository userRepository;

  @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Transactional(readOnly = true)
  public User getById(Long id) {
    return userRepository.findById(id).orElseThrow(() -> new UserNotFound(id));
  }
}
