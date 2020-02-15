package com.devisv.jwt.user.authentication.service.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "user_login")
  private String userLogin;

  @Column(name = "user_pass")
  private String userPass;

  @Column(name = "creation_at")
  private LocalDateTime creationAt;

  @Column(name = "removal_at")
  private LocalDateTime removalAt;

  @Column(name = "last_login_at")
  private LocalDateTime lastLoginAt;

  @Column(name = "active")
  private boolean active;

  public User() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUserLogin() {
    return userLogin;
  }

  public void setUserLogin(String userLogin) {
    this.userLogin = userLogin;
  }

  public String getUserPass() {
    return userPass;
  }

  public void setUserPass(String userPass) {
    this.userPass = userPass;
  }

  public LocalDateTime getCreationAt() {
    return creationAt;
  }

  public void setCreationAt(LocalDateTime creationAt) {
    this.creationAt = creationAt;
  }

  public LocalDateTime getRemovalAt() {
    return removalAt;
  }

  public void setRemovalAt(LocalDateTime removalAt) {
    this.removalAt = removalAt;
  }

  public LocalDateTime getLastLoginAt() {
    return lastLoginAt;
  }

  public void setLastLoginAt(LocalDateTime lastLoginAt) {
    this.lastLoginAt = lastLoginAt;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }
}
