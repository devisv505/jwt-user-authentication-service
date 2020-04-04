package com.devisv.jwt.user.authentication.service;

import com.devisv.jwt.user.authentication.service.model.User;
import com.devisv.jwt.user.authentication.service.model.UserRole;
import com.devisv.jwt.user.authentication.service.repository.UserRepository;
import java.util.Set;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
@Import({ Config.class })
public class UserRepositoryTest {

  @Autowired
  UserRepository userRepository;

  @Test
  public void testStoreUser() {
    User user = userRepository.save(
        new User(userRepository.next(), "devisv505@gmail.com", "password", Set.of(UserRole.ADMIN))
    );

    assertThat(user).isNotNull();
    assertThat(userRepository.count()).isEqualTo(1L);
  }

}
