package com.alucard.devopsbuddy.backend.persistence.domain.backend;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Plan implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  private int id;

  private String name;

  public Plan() {}

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Plan plan = (Plan) o;
    return id == plan.id &&
            Objects.equals(name, plan.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
