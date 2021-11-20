package com.bootcamp.jbtaxi.repository;

import java.util.Optional;

import com.bootcamp.jbtaxi.domain.Taxi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxiRepository extends JpaRepository<Taxi, Integer> {
  Optional<Taxi> findByUserId(Integer userId);
}
