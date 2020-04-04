package com.devisv.jwt.user.authentication.service.core;

import java.util.Objects;
import javax.persistence.EmbeddedId;
import javax.persistence.MappedSuperclass;
import static com.google.common.base.MoreObjects.toStringHelper;
import static com.google.common.base.Preconditions.checkNotNull;

@MappedSuperclass
public abstract class AbstractEntity <T extends EntityId> implements Entity<T> {

  @EmbeddedId
  private T id;

  protected AbstractEntity() {
  }

  public AbstractEntity(T id) {
    this.id = checkNotNull(id);
  }

  @Override
  public T getId() {
    return id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public boolean equals(Object obj) {
    boolean result = false;

    if (this == obj) {
      result = true;
    } else if (obj instanceof AbstractEntity) {
      AbstractEntity other = (AbstractEntity) obj;
      result = Objects.equals(id, other.id);
    }

    return result;
  }

  @Override
  public String toString() {
    return toStringHelper(this)
        .add("id", id)
        .toString();
  }


}
