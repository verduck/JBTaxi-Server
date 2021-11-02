package com.bootcamp.jbtaxi.repository;

import com.bootcamp.jbtaxi.domain.Waiting;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WaitingRepository extends JpaRepository<Waiting, Integer> {
    
}
