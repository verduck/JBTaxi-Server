package com.bootcamp.jbtaxi.repository;

import java.util.HashMap;

import com.bootcamp.jbtaxi.domain.Waiting;

import org.springframework.stereotype.Repository;

@Repository
public class WaitingRepository {
    private HashMap<Integer, Waiting> waitings;
}
