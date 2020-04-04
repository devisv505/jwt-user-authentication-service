package com.devisv.jwt.user.authentication.service.repository;

import com.devisv.jwt.user.authentication.service.model.User;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, UUID>, UserRepositoryCustom {

}
