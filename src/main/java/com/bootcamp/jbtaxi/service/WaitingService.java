package com.bootcamp.jbtaxi.service;

import java.util.PriorityQueue;

import com.bootcamp.jbtaxi.domain.Waiting;

import org.springframework.stereotype.Service;

@Service
public class WaitingService {
    private PriorityQueue<Waiting> waitings;
    
}
