package com.bootcamp.jbtaxi.repository;

import java.util.List;

import com.bootcamp.jbtaxi.domain.Waiting;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WaitingRepository extends CrudRepository<Waiting, Integer> {
    public List<Waiting> findByUserTaxiIsNotNull();
    public List<Waiting> findByUserTaxiIsNull();
}
