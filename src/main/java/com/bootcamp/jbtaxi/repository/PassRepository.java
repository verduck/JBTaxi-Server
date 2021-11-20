package com.bootcamp.jbtaxi.repository;

import com.bootcamp.jbtaxi.domain.Pass;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PassRepository extends JpaRepository<Pass, Integer> {
  
}
