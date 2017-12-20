package com.alucard.devopsbuddy.backend.persistence.repositories;

import com.alucard.devopsbuddy.backend.persistence.domain.backend.User;

import org.springframework.data.repository.CrudRepository;


import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
