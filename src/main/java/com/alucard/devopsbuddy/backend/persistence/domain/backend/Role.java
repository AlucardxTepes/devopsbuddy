package com.alucard.devopsbuddy.backend.persistence.domain.backend;

import java.io.Serializable;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Role implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  private int id;

  private String name;

  @OneToMany(mappedBy = "role", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private Set<UserRole> userRoles = new HashSet<>();

  public Role() {}


  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Role role = (Role) o;
    return id == role.id &&
            Objects.equals(name, role.name);
  }

  @Override
  public int hashCode() {

    return Objects.hash(id);
  }

  public int getId() {
    return id;
  }

  public Set<UserRole> getUserRoles() {
    return userRoles;
  }

  public void setUserRoles(Set<UserRole> userRoles) {
    this.userRoles = userRoles;
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
