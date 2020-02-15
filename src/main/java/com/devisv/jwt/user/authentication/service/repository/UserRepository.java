package com.devisv.jwt.user.authentication.service.repository;

import com.devisv.jwt.user.authentication.service.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
