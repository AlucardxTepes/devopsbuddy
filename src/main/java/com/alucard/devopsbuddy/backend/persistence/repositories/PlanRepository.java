package com.alucard.devopsbuddy.backend.persistence.repositories;

import com.alucard.devopsbuddy.backend.persistence.domain.backend.Plan;


import org.springframework.data.repository.CrudRepository;


import org.springframework.stereotype.Repository;

@Repository
public interface PlanRepository extends CrudRepository<Plan, Integer> {
}
