package com.devisv.jwt.user.authentication.service.model;

import com.devisv.jwt.user.authentication.service.core.AbstractEntity;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public class User extends AbstractEntity<UserId> {

  @Column(name = "email")
  private String email;

  @Column(name = "password")
  private String password;

  @ElementCollection(fetch = FetchType.EAGER)
  @Enumerated(EnumType.STRING)
  @NotNull
  private Set<UserRole> roles;

  protected User() {
  }

  public User(UserId id, String email, String password, Set<UserRole> roles) {
    super(id);
    this.email = email;
    this.password = password;
    this.roles = roles;
  }
}
