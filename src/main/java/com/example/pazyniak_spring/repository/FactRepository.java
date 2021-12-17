package com.example.pazyniak_spring.repository;

import com.example.pazyniak_spring.domain.Fact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FactRepository extends JpaRepository<Fact, Integer> {
}
